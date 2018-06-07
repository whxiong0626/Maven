package com.whx.service.Impl;

import com.whx.dao.StudentDao;
import com.whx.service.StudentService;

public class StudentServiceImpl implements StudentService {
    public  StudentServiceImpl(){
        System.out.println("StudentServiceImpl========实例化");
    }

    /**
     * 之前耦合的方式
     * 程序本身去创建dao层的实例
     *  StudentDao dao=new StudentDaoImpl();
     */
    StudentDao dao;
    /**
     01.只是定义了一个dao层的对象
     02.需要交给spring容器
     03.等待spring容器给我赋值   通过setDao()
     */

    public void setDao(StudentDao dao) {
        System.out.println("执行了======》setDao");
        this.dao = dao;
    }

    /**
     * 睡觉的方法
     */
    public void sleep() {
        System.out.println("开始记录日志");  //系统级业务
        dao.sleep();  //主业务
        System.out.println("结束记录日志"); //系统级业务
    }

    /**
     * @return 吃饭方法
     */
    public String eat() {
        System.out.println("开始记录日志"); //系统级业务
        String result=  dao.eat();//主业务
        System.out.println("结束记录日志"); //系统级业务
        return  result;

    }
}
