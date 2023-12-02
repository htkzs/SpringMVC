package com.itheima.controller;

import com.itheima.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AttributeMappingController {
    /*
     * @Author GhostGalaxy
     * @Description 测试地址：http://localhost:8080/book 测试结果：Book(bookName=三国演义, author=吴承恩, price=29.8, stock=99, sales=99, address=Address(province=陕西, city=宝鸡, town=绛帐))
     * @Date 20:20:35 2022/11/27
     * @Param [book]
     * @return java.lang.String
     **/
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String getBook(Book book) {
        System.out.println(book);
        return "success";
    }
}
