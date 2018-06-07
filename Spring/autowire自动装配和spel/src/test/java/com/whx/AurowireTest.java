package com.whx;

import com.whx.bean.Dog;
import com.whx.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

public class AurowireTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Person person=applicationContext.getBean("person",Person.class);
        System.out.println(person);
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Person person=applicationContext.getBean("person1",Person.class);
        System.out.println(person);
    }
    @Test
    public void test03(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Dog dog=applicationContext.getBean("dog",Dog.class);
        System.out.println(dog);
    }
    @Test
    public  void test04(){
        //创建el表达式
        ExpressionParser parser=new SpelExpressionParser();
        Date date=new Date();
        int year=parser.parseExpression("year").getValue(date,int.class);
        int month=parser.parseExpression("month").getValue(date,int.class);
        int day=parser.parseExpression("day").getValue(date,int.class);
        System.out.println(year+1900+"年"+(month+1)+"月"+day+"日");
        //获取int类型最大值、最小值
        //01.直接获取
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //02.使用parser获取
        int max=parser.parseExpression("T(java.lang.Integer).MAX_VALUE").getValue(int.class);
        int min=parser.parseExpression("T(java.lang.Integer).MIN_VALUE").getValue(int.class);
        System.out.println(max);
        System.out.println(min);
        //求数字之和
        int sum=parser.parseExpression("1+2+3*5").getValue(int.class);
        System.out.println(sum);
        //逻辑运算符 和 boolean值
        boolean  value  =parser.parseExpression("1>2 or 2<3").getValue(Boolean.class);
        System.out.println(value);
    }

}
