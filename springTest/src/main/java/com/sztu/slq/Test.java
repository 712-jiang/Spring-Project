package com.sztu.slq;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-10-20:47
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User  user = (User) ioc.getBean("user");
        System.out.println(user.getUsername());
    }
}
