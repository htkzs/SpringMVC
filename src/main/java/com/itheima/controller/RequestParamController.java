package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
请求测试 localhost:8080/request/param?userId=10089
 */
@Controller
public class RequestParamController {
    @RequestMapping("/request/param")
    public String request(@RequestParam("userId") String userId){
        System.out.println("userId的值为"+userId);
        return "success";
    }
}
