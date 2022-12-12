package com.itheima.interceptor;

import com.itheima.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName : MyInterceptor
 * @Description : 测试Interceptor
 * @Author : 20609
 * @Date: 2022/12/12  10:58
 */
public class MyInterceptor implements HandlerInterceptor {
    //目标方法执行之前拦截 return false为拦截 return true为放行
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor的preHandle执行");
        return true;
    }
    //目标方法刚执行完成就执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor的postHandle执行");
    }
    //页面返回后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor的afterCompletion执行");
    }
}
