package com.whx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;



    public class Student01 implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
        private  int  age;
        private  String  stuName;

        private  String  beanName; //bean在容器中的id或者name
        private BeanFactory beanFactory; //bean所在的工厂

        public Student01() {
            System.out.println("===Student类中的无参构造===");
        }

        //BeanNameAware接口中的setBeanName（）
        public void setBeanName(String beanName) {
            System.out.println("===执行了BeanNameAware接口中的setBeanName（）===");
            this.beanName=beanName;
        }

        //BeanFactoryAware中的setBeanFactory（）
        public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
            System.out.println("===执行了BeanFactoryAware中的setBeanFactory（）===");
            this.beanFactory=beanFactory;
        }


        public void initMethod(){
            System.out.println("===Student类中的initMethod（）===");
        }

        public void afterPropertiesSet() throws Exception {
            System.out.println("===InitializingBean中的afterPropertiesSet()===");
        }

        public  void myDestroy(){
            System.out.println("===Student类中的myDestroy（）===");
        }

        public void destroy() throws Exception {
            System.out.println("===DisposableBean中的destroy()===");
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            System.out.println("===Student类中给属性赋值 setAge()===");
            this.age = age;
        }

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            System.out.println("===Student类中给属性赋值 setStuName()===");
            this.stuName = stuName;
        }

        public String getBeanName() {
            return beanName;
        }

        public BeanFactory getBeanFactory() {
            return beanFactory;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", stuName='" + stuName + '\'' +
                    '}';
        }
    }

