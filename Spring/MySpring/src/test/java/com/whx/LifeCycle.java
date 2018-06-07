package com.whx;

import com.whx.bean.Student01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean生命周期
 */
public class LifeCycle {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Student01 student= context.getBean("student", Student01.class);
        System.out.println(student);
        ((ClassPathXmlApplicationContext)context).close();  //关闭容器
    }
}
