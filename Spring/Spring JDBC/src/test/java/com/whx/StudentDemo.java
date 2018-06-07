package com.whx;

import com.whx.bean.Student;
import com.whx.service.StudentService;
import com.whx.service.StudentServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class StudentDemo {
    ApplicationContext context=null;
    StudentService studentService=null;
    Logger logger= Logger.getLogger(StudentDemo.class);
    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("spring.xml");
        studentService=context.getBean("studentService", StudentServiceImpl.class);
    }

    /**
     * 添加
     */
    @Test
    public void add(){
        studentService.add(new Student("小黑",6));
    }
    /**
     * 删除
     */
    @Test
    public void delete(){
        studentService.del(5);
    }
    /**
     * 修改
     */
    @Test
    public void update1(){
        studentService.update(new Student("妮妮",8,1));
    }
    /**
     * 查询所有
     */
    @Test
    public void findAll(){
        List<Student> students=studentService.getAll();
        for (Student student:students){
            logger.debug(student);
        }
    }
}
