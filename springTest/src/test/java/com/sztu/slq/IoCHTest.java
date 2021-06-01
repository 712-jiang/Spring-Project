package com.sztu.slq;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.SoundbankResource;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-14:28
 * Spring IoC 高级使用
 */
public class IoCHTest {
    ApplicationContext ioc;
    @Before
    public void before(){
        ioc = new ClassPathXmlApplicationContext("spring_ioc_high.xml");
    }

    @Test
    public void test01() {
        System.out.println("Spring ioc high 已加载");
    }

//    懒加载，调用bean的时候才创建实例
    @Test
    public void test02() {
        System.out.println("Spring ioc high 已加载");
        Wife wife = ioc.getBean(Wife.class);
        System.out.println(wife);
    }
    //    单例多例 作用域scope
    @Test
    public void test03() {
        Person person1 = ioc.getBean(Person.class);
        Person person2 = ioc.getBean(Person.class);
    }

    /**
     * 使用静态工厂方法/实例工厂方法实例化Bean
     */
    @Test
    public void test06(){
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);
    }

    /**
     * 自动注入
     */
    @Test
    public void test07(){
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);
    }

    /**
     * 声明周期回调
     */
    @Test
    public void test08(){
        Person person = ioc.getBean("person", Person.class);
        System.out.println(person);
    }

    /**
     * 第三方Bean
     */
    @Test
    public void test09(){
        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
}
