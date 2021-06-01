package cn.sztu.slq.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-18-17:15
 */
@Aspect   //声明为切面
@Component  //放如IoC容器中！！！切面是基于IoC容器的功能
public class LogUtil {

    //前置通知
    @Before("execution(* cn.sztu.slq.service..*.*(..))")
    //..子包，子孙包；*所有的参数，所有的类，所有的方法；（..）所有参数
    public static void before() {
        System.out.println("方法前");
//        System.out.println(method.getName()+"方法运行前，参数是" +
//                (args==null?"": Arrays.asList(args).toString()));
    }

    //后置通知
    @After("execution(* cn.sztu.slq.service..*.*(..))")
    public static void after() {
//        System.out.println(method.getName()+"方法运行后，参数是" +
//                (args==null?"": Arrays.asList(args).toString()));
        System.out.println("方法后");
    }

    //后置异常通知
    @AfterThrowing("execution(* cn.sztu.slq.service..*.*(..))")
    public static void afterException() {
//        System.out.println("方法报错：" +ex.getMessage());
        System.out.println("方法异常");
    }

    //后置返回通知
    @AfterReturning("execution(* cn.sztu.slq.service..*.*(..))")
    public static void afterEnd() {
//        System.out.println("方法结束，返回值是：" +ex.getMessage());
        System.out.println("方法返回");
    }

}
