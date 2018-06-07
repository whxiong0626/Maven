package com.whx.test.controller;

import com.whx.test.bean.Invitation;
import com.whx.test.service.InvitationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/invitation")
public class InvitationController {
    @Resource
    private InvitationService service;

    @RequestMapping("/invitation/add")
    public String add(){
        System.out.println("进入了add");
        service.add(new Invitation("dasda","dafdf","dasddddd"));
        return "success";
    }
}
