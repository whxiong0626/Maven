package com.whx.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method   目标方法
     * @param objects   方法中的参数列表
     * @param o         目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("*********执行了前置通知*********");
    }
}
