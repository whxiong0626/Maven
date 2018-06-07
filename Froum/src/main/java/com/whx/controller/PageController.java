package com.whx.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.whx.bean.Invitation;

import com.google.gson.Gson;
import com.whx.service.InvitationService;
import com.whx.service.impl.InvitationServiceImpl;
import com.whx.util.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*@WebServlet(value="/amzd_02/Userpage")*/
@Controller
@RequestMapping("/find/invitation/doPost")
public class PageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        InvitationService service = new InvitationServiceImpl();
        PageInfo<Invitation> inv = service.findAlls(
                Integer.parseInt(req.getParameter("pageNum")), 3);
        inv.setTotal(service.getTotalCount());
        System.out.println("pageNum=====>" + req.getParameter("pageNum"));
        inv.setPageNum(Integer.parseInt(req.getParameter("pageNum")));
        System.out.println("总记录数===》" + inv.getTotal());
        Gson gson = new Gson();
        String json = gson.toJson(inv);
        System.out.println(json);
        // 获取输出流对象
        PrintWriter writer = resp.getWriter();
        writer.print(json); // 返回数据给前台
        writer.close();
    }

}
