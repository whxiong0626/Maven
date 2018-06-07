package com.whx.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("==========方法执行之前   环绕通知==========");
        Object result=methodInvocation.proceed();
        if (result!=null){
            result ="两碗牛肉面";
        }
        System.out.println("==========方法执行之后   环绕通知==========");

        return result;
    }
}
