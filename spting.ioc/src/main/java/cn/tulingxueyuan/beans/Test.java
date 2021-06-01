package cn.tulingxueyuan.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-10-20:47
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user);
    }
}
