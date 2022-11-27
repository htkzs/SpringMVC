package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Hello")
public class HelloSpringController {
    @RequestMapping(value = "/index",method = RequestMethod.GET,headers = {"User-Agent= "})
    public String index(){
        return "success";
    }
}
