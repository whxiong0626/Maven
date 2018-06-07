package com.whx.util;

import com.whx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringDemo {

/*    //使用多个参数接收
    @RequestMapping("/add")
    public String  add(String username, String pwd){
        System.out.println("使用多个参数接收！");
        System.out.println(username);
        System.out.println(pwd);
        return "index";
    }*/
    //使用对象接收
    @RequestMapping("/user")
    public String  user(User user){
        System.out.println("使用对象接收！");
        System.out.println(user.getUsername());
        System.out.println(user.getPwd());
        return "index";
    }
    //使用校正参数方法接收
    @RequestMapping("/add")
    public String  add(@RequestParam(name = "username") String names,String pwd){
        System.out.println("使用校正参数方法接收！");
        System.out.println(names);
        System.out.println(pwd);
        return "index";
    }
}
