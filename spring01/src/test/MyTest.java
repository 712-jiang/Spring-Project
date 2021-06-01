package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import seivice.IUserSeivice;
import seivice.impl.UserSeiviceImpl;

/**
 * @author qingqing
 * @function:
 * @create 2020-12-24-23:19
 */
public class MyTest {
    public static void main(String[] args) {
        //加载spring上下，加载ioc容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring.xml");

        IUserSeivice seivice = ioc.getBean(IUserSeivice.class);
        seivice.getUser();
    }
}
