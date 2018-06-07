package com.whx.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whx.bean.Invitation;
import com.whx.service.InvitationService;
import com.whx.service.impl.InvitationServiceImpl;
import com.whx.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/findAll")
public class InvitationController extends HttpServlet {
    @Autowired
    private InvitationService invitationServiceImpl;

    @RequestMapping("/inv")
    public void findALL(Invitation invitation, HttpSession session, HttpServletResponse response){
        List<Invitation> invitationList=invitationServiceImpl.findAll();
        session.setAttribute("invitation",invitationList);
       /* System.out.println("221");
        PageInfo<Invitation> inv = invitationServiceImpl.findAlls(
                Integer.parseInt(req.getParameter("pageNum")), 3);
        System.out.println("1111");
        inv.setTotal(invitationServiceImpl.getTotalCount());
        System.out.println("pageNum=====>" + req.getParameter("pageNum"));
        inv.setPageNum(Integer.parseInt(req.getParameter("pageNum")));
        System.out.println("总记录数===》" + inv.getTotal());*/
        /*Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();*/
        Gson gson=new Gson();
        String json=gson.toJson(invitationList);
        /*String jsom=gson.toJson(inv);*/
        System.out.println(json);
        try {
            PrintWriter writer=response.getWriter();
            writer.print(json);
           /* writer.print(jsom);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
