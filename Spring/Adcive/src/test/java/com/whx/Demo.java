package com.whx;

import com.whx.advice.MyException;
import com.whx.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    /**
     * 前置通知
     */
    @Test
    public void demoBefore(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao dao=context.getBean("userProxy",UserDao.class);
        dao.eat();
        System.out.println("---------------------------------------");
        dao.sleep();
    }
    /**
     * 后置通知
     */
    @Test
    public void demoAfter(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao dao=context.getBean("userProxy",UserDao.class);
        dao.eat();
        System.out.println("---------------------------------------");
        dao.sleep();
    }
    /**
     * 环绕通知
     */
    @Test
    public void  testAround(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao= context.getBean("userProxy",UserDao.class);
        String  result=userDao.eat();
        System.out.println(result);
    }

    /**
     * 异常通知
     */
    @Test
    public void  testException() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = context.getBean("exceptionProxy", UserDao.class);
        try {
            userDao.login("admn", "123456");
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
   /**
    *  使用顾问  advisor.xml
    */
    @Test //前置通知
    public void  testBeforeAdvisor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Advisor1.xml");
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        userDao.eat();
        userDao.sleep();
    }
    @Test //前置通知
    public void  testAfterAdvisor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Advisor1.xml");
        UserDao userDao = context.getBean("userProxy1", UserDao.class);
        userDao.eat();
        userDao.sleep();
    }
    /**
     *  使用顾问  regex.xml
    */
    @Test //前置通知
    public void  testRegex() {
        ApplicationContext context = new ClassPathXmlApplicationContext("regex.xml");
        UserDao userDao = context.getBean("userProxy", UserDao.class);
        userDao.eat();
        userDao.sleep();
    }
}
