package com.whx.dao;

import com.whx.advice.MyException;

public class UserDaoImpl implements UserDao {
    @Override
    public String eat() {
        System.out.println("正在吃饭!");
        return "牛肉面";
    }

    @Override
    public void sleep() {
        System.out.println("正在睡觉!");
    }

    @Override
    public boolean login(String name, String pwd) throws MyException {
        if (!"admin".equals(name)){
            throw new MyException("用户名错误！");
        }
        if (!"123456".equals(pwd)){
            throw new MyException("密码错误！");
        }
        return false;
    }
}
