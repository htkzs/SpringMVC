package com.itheima.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName : ExceptionHandler
 * @Description : 测试SpringMVC的异常处理机制
 * @Author : 20609
 * @Date: 2022/12/12  15:57
 */
@Controller
public class ExceptionHandlerTest {
    /**
    * @Param :
    * @Description :  演示异常的发生 测试的URL http://localhost:8080/springmvc/exception?index=0
    * @Author : 20609
    * @Date : 2022/12/12 16:00
    */

    @RequestMapping("/exception")
    public String showException(@RequestParam("index") Integer index){
        //发生异常时被异常方法捕捉后进行处理
        int i = 10/index;
        return "success";
    }
    /**
    * @Param :
    * @Description :  当发生数学异常时 @ExceptionHandler标注的方法只限于处理本类发生的异常
    * @Author : 20609
    * @Date : 2022/12/12 16:06
    */

    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView exceptionHandler(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("ex",exception);
        //视图解析器会拼串
        return modelAndView;

    }
}
