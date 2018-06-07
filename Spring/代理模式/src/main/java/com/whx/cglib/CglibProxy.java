package com.whx.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer=new Enhancer();
    /**
     * 创建代理类对象
     */
    public Object createProxy(Class clazz){
        //设置公共的接口或者父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理类执行 委托类的 方法
     * 系统级业务进行增强
     */

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("=======先洗洗手=======");
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println("=======再洗洗手=======");
        return result;
    }
}
