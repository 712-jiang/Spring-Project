package cn.sztu.slq.dao.Impl;

import cn.sztu.slq.dao.IUserDao;
import cn.sztu.slq.entity.User;
import com.alibaba.druid.pool.DruidDataSource;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-20-17:05
 */
@Repository
public class UserDaoImpl implements IUserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired  //自动注入数据源-dataSource
    public void setDataSource(DruidDataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public User getUser(){
        //创建一个User类型的jdbcTemplate类型，作为返回值
        return jdbcTemplate.queryForObject("select * from t_user where id = 1",new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void sub() {
        jdbcTemplate.update("update t_user set balance = balance-200 where id = 1");
    }

    @Override
    public void save() {
        jdbcTemplate.update("update t_user set balance = balance+200 where id = 2");
    }


}

