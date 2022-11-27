package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnotationController {
    /*
     * @Author GhostGalaxy
     * @Description 请求路径为：http://localhost:8080/request?userId=123 测试结果获取到的参数userId值为123
     * @Date 19:10:16 2022/11/27
     * @Param [userId]
     * @return java.lang.String
     **/
    @RequestMapping("/request")
    public String requestParam(@RequestParam("userId") String userId){
        System.out.println("获取到的参数userId值为"+userId);
        return "success";
    }
    /*
     * @Author GhostGalaxy
     * @Description 获取请求头当中的属性 http://localhost:8080/header
     * 测试结果:获取到请求头的参数userAgent值为Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36
     * @Date 19:12:29 2022/11/27
     * @Param [userAgent]
     * @return java.lang.String
     **/
    @RequestMapping("/header")
    public String requestHeader(@RequestHeader("User-Agent") String userAgent){
        System.out.println("获取到请求头的参数userAgent值为"+userAgent);
        return "success";
    }
    /*
     * @Author GhostGalaxy
     * @Description   获取JESSIONID的值 测试路径为 http://localhost:8080/cookie  原生javaWeb方式获取到的cookie是多个值，需要遍历
     * @Date 19:08:23 2022/11/27
     * @Param [JESSIONID]
     * @return java.lang.String
     **/
    @RequestMapping("/cookie")
    public String cookieRequest(@CookieValue(value="JSESSIONID",required = false) String JSESSIONID){
        System.out.println("获取到请求头的参数userAgent值为"+JSESSIONID);
        return "success";
    }
}
