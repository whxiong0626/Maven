package com.whx.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class AnimalProxy implements InvocationHandler{
    /**
     * 这里绝对不能使用Dog！ 因为我们压根不知道谁是委托类
     */
    private  Object object;
    /**
     * 传递一个委托类，我们返回一个代理类
     */
    public Object createProxy(Object target){
        this.object=target;//传递什么 委托类是什么
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    /**
     *  代理类给委托类 工作的方法
     *  给 主业务增强
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=======先洗洗手=======");
        Object result=method.invoke(object,args);
        System.out.println("=======再洗洗手=======");
        return result;
    }
}
