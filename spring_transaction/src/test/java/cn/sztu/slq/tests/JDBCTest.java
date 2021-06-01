package cn.sztu.slq.tests;

import cn.sztu.slq.entity.User;
import cn.sztu.slq.service.IUserService;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-20-17:22
 */
public class JDBCTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @Before  //和切面中的Before区分开
    public void before(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring_transaction.xml");
    }

    @Test
    public void test01(){
        DruidDataSource bean = classPathXmlApplicationContext.getBean(DruidDataSource.class);
        System.out.println(bean);
    }

    /**
     * JdbcTemplate演示访问数据库
     */
    @Test
    public void test02(){
        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_user", Long.class);
        System.out.println(aLong);
    }

    /**
     * 查询单个值
     */
    @Test
    public void test03(){
        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        String aLong = jdbcTemplate.queryForObject("select realname from t_user where id = 1 ", String.class);
        System.out.println(aLong);
    }

    /**
     * 查询单个实体对象，一行信息
     * 数据库字段名和类中的属性名相同
     */
    @Test
    public void test04(){
        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        User user = jdbcTemplate.queryForObject("select * from t_user where id = 1 ", new BeanPropertyRowMapper<>(User.class));
        System.out.println(user);
    }

    /**
     * 查询List<实体>
     */
    @Test
    public void test05(){
        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        List<User> user = jdbcTemplate.query("select * from t_user where id = 1 ", new BeanPropertyRowMapper<>(User.class));
        System.out.println(user);
    }

    /**
     * 插入
     */
    @Test
    public void test06(){
        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        int result = jdbcTemplate.update ("insert into t_user(id,realname,cardno,balance) values(?,?,?,?)",
                5,"青青","123456783",800);
        System.out.println(result);
    }

    /**
     *
     */
    @Test
    public void test07(){
        IUserService bean = classPathXmlApplicationContext.getBean(IUserService.class);
        System.out.println(bean.getUser());
    }
}

