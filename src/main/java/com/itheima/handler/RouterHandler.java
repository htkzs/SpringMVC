package com.itheima.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : RouterHandler
 * @Description : 测试请求转发和重定向
 * @Author : 20609
 * @Date: 2022/11/28  17:41
 */
@Controller
public class RouterHandler {
    @RequestMapping("/handle")
    public String forwardSuccess(){
        /*
        这里的 / 表示是当前工程 必须写上否则容易报错。
        注意使用了forward就不会在走视图解析器了 直接会在当前工程的根目录下去查找。
         */
        return "forward:/success.jsp";
    }

    /**
     * 进行二次派发操作
     * @return
     */
    @RequestMapping("/handle02")
    public String secondSend(){
        return "forward:/handle";
    }
    /**
    * @Param :
    * @Description :  先走视图解析器，然后进行目录回退。
    * @Author : 20609
    * @Date : 2022/11/28 17:52
    */

    @RequestMapping("/handle03")
    public String forwardSuccess01(){
        return "../../success.jsp";
    }

    /**
    * @Param :
    * @Description :  重定向到he1lo.jsp页面
     *                转发forward:转发的路径
     *                重定向redirect:重定向的路径
     *                        原生的Servlet重定向/路径需要加上项目名才能成功 response.sendRedirect("/hello.jsp")
     *                springMVC会自动拼上项目名
    * @Author : 20609
    * @Date : 2022/11/28 17:54
    */
    @RequestMapping("/handle04")
    public String redirectSuccess01(){
        return "redirect:/success.jsp";
    }
}