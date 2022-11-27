package com.itheima.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        //通过javaConfig的方式创建Spring容器 相当于替换application.xml
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        //创建父容器
//        AnnotationConfigApplicationContext contex1t=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        //指定父子关系
//        context.setParent(contex1t);
//        DispatcherServlet dispatcherServlet = new DispatcherServlet((WebApplicationContext) context);
//        //指定servlet的名字 相当于替换web.xml
//        ServletRegistration.Dynamic registration = servletContext.addServlet("app", dispatcherServlet);
//        //指定映射关系
//        registration.addMapping("/app/*");
//
//    }
//}
