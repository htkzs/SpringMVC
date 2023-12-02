package com.itheima.controller;

import com.itheima.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        String result = helloService.syaHello();
        return result;
    }
}

