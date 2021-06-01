package cn.sztu.slq.Proxy.deniamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-18-15:42
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理类
    Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    //代理类的执行方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("日志：调用了add方法，参数是：" + Arrays.asList(args));//要增强的方法
        /*
        执行被代理方法
        Object obj 被代理对象
        Object... args 被代理的方法参数
        * */
        Object invoke = method.invoke(target, args);//执行真正的add方法
        //公共动态代理，不确定返回值，用Object类型接收
        System.out.println("日志："+ invoke);

        return invoke;
    }
}
