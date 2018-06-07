package com.whx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCdemo {
        @RequestMapping("/hello")
    public String hello(){
            System.out.println("进入了hello");
            return "/WEB-INF/index.jsp";
        }
}