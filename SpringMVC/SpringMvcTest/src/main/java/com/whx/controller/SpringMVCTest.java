package com.whx.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SpringMVCTest extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("进入了第二个hello");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/WEB-INF/index.jsp");
        return modelAndView;
    }
}
