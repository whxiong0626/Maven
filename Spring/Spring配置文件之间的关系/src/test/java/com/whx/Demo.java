package com.whx;
import com.whx.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo01(){

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");


/*
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-student.xml","spring-grade.xml");
*/

        Student student=context.getBean("student",Student.class);
        System.out.println(student);
    }
}
