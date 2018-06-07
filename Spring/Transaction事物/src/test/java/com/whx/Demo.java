package com.whx;

import com.whx.service.StockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        StockService service=context.getBean("StockService",StockService.class);
        service.buyStock("张三",4000.0,10
        );
    }
    @Test
    public void demo01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspectj.xml");
        StockService service=context.getBean("StockService",StockService.class);
        service.buyStock("张三",4000.0,10
        );
    }
    @Test
    public void demo02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aspect.xml");
        StockService service=context.getBean("StockService",StockService.class);
        service.buyStock("张三",20,10
        );
    }
}
