package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @project
 * @description 在SpringMVC中处理原生servlet API
 * @author 66
 * @date 2022/11/27 20:24:36
 * @version 1.0
 */
@Controller
public class PrimitiveAPIController {
    @RequestMapping("/api")
    public String getPrimitiveAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        try {
            request.setAttribute("hello","hello springMVC");
            session.setAttribute("hello1","hello Spring");

            //得到请求字节流 用于文件上传
            ServletInputStream inputStream = request.getInputStream();
            //得到字符流
            BufferedReader reader = request.getReader();

            ServletOutputStream outputStream = response.getOutputStream();
            response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";

    }
}
