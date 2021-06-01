package com.sztu.slq;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-09-20:45
 * Sping IoC基本使用
 */
public class IoCTest {
    ApplicationContext ioc;

//  下面的test文件都调用同一个.xml可以将ApplicationContext写在最前面
    @Before
    public void before() {
//      加入Spring上下文
//      ClassPathXmlApplicationContext根据项目路径的xml配置来实例化spring容器
//      在容器实例化的时候会加载所有的bean
        ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
    }

    @Test
    public void test01(){
        System.out.println("Spring 已经加载");
//        获取Bean
//        1.通过类获取:
//        User bean = ioc.getBean(User.class);
//        2.通过bean的名字或者id获取：User bean = ioc.getBean(s:"user")
 //        3.通过名字+类型： 当一个类在Bean中有两个名字，用于区别
        User bean = ioc.getBean("user",User.class);
        System.out.println(bean);
    }
//通过别名获取Bean
    @Test
    public void test02() {
        User bean = ioc.getBean("tulingxueyuan",User.class);;
        System.out.println(bean);
    }

    /**
     * 基于stter方法的依赖注入
     */
    @Test
    public void test03(){
        User bean = ioc.getBean("user6",User.class);;
        System.out.println(bean);
    }

    /**
     * 基于构造函数的依赖注入
     */
    @Test
    public void test04(){
        User bean = ioc.getBean("user7",User.class);;
        System.out.println(bean);
    }

    /**
     * 基于复杂数据类型的依赖注入
     */
    @Test
    public void test05(){
        Person bean = ioc.getBean("person",Person.class);;
        System.out.println(bean);
    }

}
