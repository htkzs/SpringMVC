package com.itheima.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : InterceptorHandler
 * @Description : 测试SpringMVC的拦截器 测试URL http://localhost:8080/springmvc/hello/interceptor
 * @Author : 20609
 * @Date: 2022/12/12  10:55
 */
@Controller
public class InterceptorHandler {
    @RequestMapping("/hello/interceptor")
    public String testInterceptor() {
        System.out.println("目标方法执行了......");
        return "success";
    }
}
