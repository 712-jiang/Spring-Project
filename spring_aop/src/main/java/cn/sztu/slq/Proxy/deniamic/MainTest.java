package cn.sztu.slq.Proxy.deniamic;

import org.junit.Test;

import javax.sound.midi.SoundbankResource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-17-14:47
 */
/*
 * 使用jdk动态代理完成增加日志的功能:动态生成代理类
 * */
public class MainTest {
    @Test
    public void test(){
        //动态创建代理类、
        /*
        ClassLoader loader,类加载器，指定被代理类接口的类加载器
        Class<?>[] interfaces,类型，指定被代理类接口类型
        InvocationHandler h委托执行的处理类：eg日志功能
        * */
        ICalculator proxy = (ICalculator) MainTest.createProxy(new Calculator());  //公共代理
        proxy.add(1,1);

    }

    /**
     * 公共jdk动态代理对象生成方法
     * @return
     */
    public static Object createProxy(Object needProxy) {
        //动态创建代理类、
        /*
        ClassLoader loader,类加载器，指定被代理类接口的类加载器
        Class<?>[] interfaces,类型，指定被代理类接口类型
        InvocationHandler h委托执行的处理类：eg日志功能
        * */
        ClassLoader classLoader = needProxy.getClass().getClassLoader();  //获得被代理对象类
        Class<?>[] interfaces = needProxy.getClass().getInterfaces();  //获得被代理对象接口

        //传入被代理对象
        InvocationHandler handler = new MyInvocationHandler(new Calculator());

        //动态创建代理类
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
        System.out.println(o.getClass());
        return o;

        //调用
        //System.out.println(((ICalculator) o).add(1,1));
        //调用o.add()的时候，不是去执行Calculator的.add方法，跳转到MyInvocationHandler，执行增强方法
    }
}
