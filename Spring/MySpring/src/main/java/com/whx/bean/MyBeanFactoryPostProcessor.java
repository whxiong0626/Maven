package com.whx.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

        /**
        * Processor  本意是加工 处理的意思！
        *
        * 实现了BeanFactoryPostProcessor   工厂的后处理器
        */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcessor(){
        System.out.println("===MyBeanFactoryPostProcessor的无参构造方法 ===");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("===MyBeanFactoryPostProcessor的postProcessBeanFactory ===");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("student");
        beanDefinition.getPropertyValues().addPropertyValue("stuName","小白");
    }
}
