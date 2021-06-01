package cn.sztu.slq.tests;

import cn.sztu.slq.Beans.Job;
import cn.sztu.slq.Beans.MyImportSelector;
import cn.sztu.slq.Beans.Travel;
import cn.sztu.slq.Beans.User;
import cn.sztu.slq.IocJavaConfig;
import cn.sztu.slq.controller.UserController;
import cn.sztu.slq.service.Impl.RoleServiceImpl;
import cn.sztu.slq.service.UserService;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-14-17:25
 */
public class IocTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @Before
    public void before(){
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring_aop.xml");
    }

    /*
    *被代理类使用接口，切面调用
    * */
    @Test  //不要忘记！
    public void test01(){
        //当被代理类实现接口，必须用接口实现.getBean,不能用代理类.class获取
        //AOP截断了代理类，spring找不到被代理类，因为代理类也实现了接口，所以可以用接口getBean
        //也可用被代理类默认id创建：UserService bean = classPathXmlApplicationContext.getBean("userService");
        UserService bean = classPathXmlApplicationContext.getBean(UserService.class);
        System.out.println(bean.getClass());
        //class com.sun.proxy.$Proxy35
        //有接口的被代理类，AOP选择jdk的方式生成切面
        bean.getBean();

    }

    /*
     *被代理类不使用接口，切面调用
     * */
    @Test
    public void test02(){
        //当被代理类没有实现接口，才用使用如下方式获取Bean：.getBean(类名.class)
        RoleServiceImpl bean = classPathXmlApplicationContext.getBean(RoleServiceImpl.class);
        System.out.println(bean.getClass());
        //class cn.sztu.slq.service.Impl.RoleServiceImpl$$EnhancerBySpringCGLIB$$2373490b
        //AOP自动采用cglib创建切面
        bean.getBean();

    }
}


