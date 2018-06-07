package com.whx.advice;

public class MyException extends RuntimeException {
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }
    public MyException(String msg, Throwable ex){
        super(msg,ex);
    }
}
