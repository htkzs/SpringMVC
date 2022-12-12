package com.itheima.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName : LoginController
 * @Description : 登录控制器 测试URL http://localhost:8080/springmvc/login?username=admin123
 * @Author : 20609
 * @Date: 2022/12/12  16:36
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("username") String userName){
        if("admin".equals(userName)){
            System.out.println("登录成功");
            ModelAndView modelAndView = new ModelAndView("success");
            return modelAndView;
        }else{
            System.out.println("登录失败");
            //将异常抛出给tomcat去处理
            throw new UserNameNotFindException();
        }
    }
    /**
    * @Param :
    * @Description :  模拟一个HttpRequestMethodNotSupportException springMVC定义的异常 通过地址栏 http://localhost:8080/springmvc/request/exception
     * 访问一个POST请求将产生HttpRequestMethodNotSupportException
    * @Author : 20609
    * @Date : 2022/12/12 17:03
    */

    @RequestMapping(value = "/request/exception",method = RequestMethod.POST)
    public ModelAndView testHttpRequestMethodNotSupportException(){
        ModelAndView modelAndView = new ModelAndView("success");
        return modelAndView;
    }


}
