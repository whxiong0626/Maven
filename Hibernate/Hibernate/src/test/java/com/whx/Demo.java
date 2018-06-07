package com.whx;

import com.whx.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Demo {
    Transaction transaction=null;
    Session session=null;
    @Before
    public void before(){
        //01.读取核心配置文件 configure()底层就是加载了/hibernate.cfg.xml
        Configuration configuration=new Configuration().configure();
        //02.创建会话工厂 sessionFactory
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        //03.创建会话  session
         session=sessionFactory.openSession();
        //04.开启事务
        transaction=session.beginTransaction();
    }
    @After
    public void after(){
        //07.提交事务
        transaction.commit();
        //08.关闭会话
        session.close();
    }

    /**
     * 新增
     */
    @Test
    public void studentAdd(){
        Student st=new Student("小红",15);
        System.out.println("***************************");
        session.save(st);
        System.out.println("****************");
    }
    /**
     * 删除
     */
    @Test
    public  void  studentDelete(){
    Student st=new Student();
    st.setSid(7);
    session.delete(st);
    }
    /**
     * 修改
     */
    @Test
    public  void  studentUpdate(){
        Student st=new Student();
        st.setSid(6);
        st.setSname("小白666");
        st.setAge(16);
        session.update(st);
    }
    /**
     * 查询指定id信息
     * 使用get，立即产生sql语句
     */
    @Test
    public  void  studentSelect(){
        Student st= (Student) session.get(Student.class,6);
        System.out.println(st);
    }
    /**
     * 查询指定id信息
     * 使用load,懒加载
     */
    @Test
    public  void  studentSelect01(){
        Student st= (Student) session.load(Student.class,6);
        System.out.println(st);
    }
    /**
     * evict  从session中清除指定的对象
     */
    @Test
    public void studentEvict(){
        Student st1= (Student) session.get(Student.class,1);
        Student st2= (Student) session.get(Student.class,2);
        session.evict(st1);
        System.out.println(st1);
        System.out.println(st2);
    }

}
