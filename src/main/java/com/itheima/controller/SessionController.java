package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


//测试使用servlet原生的apo给session域中存放数据
@Controller
public class SessionController {
    @RequestMapping("/handle06")
    public String handle06(Model model,HttpSession session){
        model.addAttribute("subject","springmvc");
        session.setAttribute("subject","springmvc");
        return "success";
    }
}
