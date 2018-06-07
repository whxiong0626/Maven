package com.whx.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class MyAspectJ {
    /**
     * 前值增强
     */
    @Before("execution(* *..UserDao.sleep(..))")
    public void before(){
        System.out.println("------前值增强------");
    }
    /**
     * 后值增强
     */
    @AfterReturning("execution(* *..UserDao.sleep(..))")
    public void after(){
        System.out.println("------后值增强------");
    }
    //获取方法的返回值
    /*@AfterReturning(value = "executtion(* *.UserDao.sleep(..))",returning="result")
    public void afterReturn(String result){
        System.out.println("------后置增强...."+result+"------");
    }*/
    /**
     * 环绕增强可以改变返回值
     */
    @Around("execution(* *..UserDao.eat(..))")
    public Object around(ProceedingJoinPoint point){
        System.out.println("======环绕增强进来======");
        Object result=null;
        try {
            //执行目标方法
            result=point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("======环绕增强出去======");
        return  "三碗牛肉面";
    }
}
