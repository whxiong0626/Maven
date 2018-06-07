package com.whx;

import com.whx.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJDemo {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao dao=context.getBean("userDaoImpl",UserDao.class);
        dao.sleep();
        dao.eat();
    }
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspectj.xml");
        UserDao dao=context.getBean("userDaoImpl",UserDao.class);
        dao.sleep();
        dao.eat();
    }
}
