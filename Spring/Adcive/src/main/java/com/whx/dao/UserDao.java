package com.whx.dao;

import com.whx.advice.MyException;

public interface UserDao {
    /**
     * 主业务，吃饭
     */
    String eat();
    /**
     * 主业务，睡觉
     */
    void sleep();
    /**
     * 验证异常通知
     */
    boolean login(String name,String pwd) throws MyException;
}
