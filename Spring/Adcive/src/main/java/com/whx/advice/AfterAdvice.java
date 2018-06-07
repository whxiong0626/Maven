package com.whx.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    /**
     * @param o         目标方法的返回值，我们只能看，能改，但是没意义
     * @param method   目标方法
     * @param objects   方法中的参数列表
     * @param o1        目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("*********执行了后置通知*********");

    }
}
