package com.itheima.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName : UniteExceptionAdvice
 * @Description : 统一异常处理器
 * @Author : 20609
 * @Date: 2022/12/12  16:21
 */
@ControllerAdvice
public class UniteExceptionAdvice {
    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView exceptionHandler(Exception exception){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("ex",exception);
        //视图解析器会拼串
        return modelAndView;

    }
    /**
    * @Param :
    * @Description :  用于处理所有可能的异常
    * @Author : 20609
    * @Date : 2022/12/12 17:06
    */

//    @ExceptionHandler(value = {NullPointerException.class})
//    public ModelAndView exceptionHandler01(Exception exception){
//        ModelAndView modelAndView = new ModelAndView("error");
//        modelAndView.addObject("ex",exception);
//        //视图解析器会拼串
//        return modelAndView;
//
//    }

}
