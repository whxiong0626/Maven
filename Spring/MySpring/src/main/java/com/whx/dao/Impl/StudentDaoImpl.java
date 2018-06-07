package com.whx.dao.Impl;

import com.whx.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
    public StudentDaoImpl(){
        System.out.println("StudentDaoImpl=======实例化");
    }

    /**
     * 睡觉的方法
     */
    public void sleep() {
        System.out.println("学生睡觉的方法");
    }

    /**
     * @return 吃饭方法
     */
    public String eat() {
        System.out.println("学生吃饭方法");
        return "apple";
    }
}
