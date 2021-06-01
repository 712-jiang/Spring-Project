package cn.sztu.slq.tests;

import cn.sztu.slq.service.IUserService;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-22-17:23
 */
public class TransactionTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @Before  //和切面中的Before区分开
    public void before(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring_transaction.xml");
    }


    @Test
    public void test01(){

        IUserService service = classPathXmlApplicationContext.getBean(IUserService.class);
        service.trans();
    }

}
