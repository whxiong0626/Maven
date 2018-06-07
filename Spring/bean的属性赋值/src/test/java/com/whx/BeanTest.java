package com.whx;

import com.whx.bean.Grade;
import com.whx.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
                Grade grade=applicationContext.getBean("grade",Grade.class);
        Student student=applicationContext.getBean("student",Student.class);
        System.out.println(grade);
        System.out.println(student);
    }
}
