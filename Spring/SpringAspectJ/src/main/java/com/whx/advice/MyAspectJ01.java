package com.whx.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectJ01 {
    public void  before(){
        System.out.println("------前值增强------");
    }

    public void  afterReturning(){
        System.out.println("------后值增强------");
    }

    /**
     * 环绕增强可以改变返回值
     */
    public Object  around(ProceedingJoinPoint point){
        System.out.println("======环绕增强进来======");
        Object result=null;
        try {
            result=  point.proceed(); //执行目标方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("======环绕增强出去======");
        return  "四碗牛肉面";
    }
}
