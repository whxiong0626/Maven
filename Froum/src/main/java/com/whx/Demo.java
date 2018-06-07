package com.whx;


import com.whx.bean.Invitation;
import com.whx.service.InvitationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {

    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-*.xml");
        InvitationService service=context.getBean("invitationServiceImpl",InvitationService.class);
        List<Invitation> invitationList= service.findAll();
        System.out.println(invitationList);
    }

}
