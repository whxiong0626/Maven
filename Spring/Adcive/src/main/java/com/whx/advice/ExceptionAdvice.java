package com.whx.advice;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(MyException ex){
        System.out.println("进入了异常通知！");
        System.out.println(ex.getMessage());
    }
}
