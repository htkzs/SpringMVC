package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestRequestController {
    /*
     * @Author GhostGalaxy
     * @Description 添加操作
     * @Date 17:17:21 2022/11/27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.POST)
    public String addBook(@PathVariable("bookId") String bookId) {
        System.out.println("成功添加一本图书" + bookId);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 删除一本图书
     * @Date 17:18:53 2022/11/27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("bookId") String bookId) {
        System.out.println("成功删除一本图书" + bookId);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 修改一本图书
     * @Date 17:19:09 2022/11/27
     * @Param
     * @return
     **/
    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("bookId") String bookId) {
        System.out.println("成功修改一本图书" + bookId);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description 查询
     * @Date 17:19:34 2022/11/27
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET)
    public String queryBook(@PathVariable("bookId") String bookId) {
        System.out.println("成功查询一本图书" + bookId);
        return "success";
    }
}
