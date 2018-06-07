package com.whx;

import com.whx.bean.Student;
import com.whx.service.Impl.StudentServiceImpl;
import com.whx.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StudentTest {
    /**
     * 之前的方式
        public  void  test(){
        //实例化service层对象
        StudentService service=new StudentServiceImpl();
        service.sleep();
    }*/
    /**
     *ApplicationContext接口有个实现类
     * ClassPathXmlApplicationContext("spring.xml")
     *   特点：
     *   applicationContext.xml文件中配置的所有bean都实例化了！
     */
    @Test
    public  void  test02(){
        //通过spring容器来 实例化service层对象
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("=======================================");
        //applicationContext.xml文件中bean的id
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }

    /**
     * 实现按需加载  不是把核心文件中配置的所有bean都实例化！
     */
    @Test
    public  void  test03(){
        //通过spring容器来 实例化service层对象
        XmlBeanFactory context=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        System.out.println("=======================================");
        //spring.xml文件中bean的id
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }

    /**
     * 从某个位置获取核心配置文件
     */
    @Test
    public  void  test04(){
        //通过spring容器来 实例化service层对象
        ApplicationContext context=new FileSystemXmlApplicationContext("e:/Maven/Spring/MySpring/src/main/resources/applicationContext.xml");
        System.out.println("=======================================");
        //applicationContext.xml文件中bean的id
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }

    /**
     * 验证单例模式
     * 所有由spring容器创建出来的对象 默认都是单例的
     */
    @Test
    public  void  test05(){
        //通过spring容器来 实例化service层对象
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("==========================================");
        //applicationContext.xml文件中bean的id
        Student stu1= (Student) context.getBean("student");
        System.out.println(stu1);
        Student stu2= (Student) context.getBean("student");
        System.out.println(stu1==stu2);
    }
}

