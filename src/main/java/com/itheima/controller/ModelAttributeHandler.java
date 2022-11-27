package com.itheima.controller;


import com.itheima.entity.Book2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ModelAttributeHandler {
    /*
     * @Author GhostGalaxy
     * @Description 增加了@ModelAttribute 的对象是从数据库中查出来的 而不时新new对象
     * 测试数据：数据库修改成功修改后的book为Book2(bookName=三国演义, author=吴承恩, price=29.8, stock=99, sales=99) 发现前端bookName传入null但取的是数据库的
     * @Date 21:52:25 2022/11/27
     * @Param [book]
     * @return java.lang.String
     **/
    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("book") Book2 book){
        book.setAuthor("吴承恩");
        book.setPrice(29.8);
        /*
        其它字段不做修改 检测没有修改的字段是不是会沿用数据库的字段
         */
        System.out.println("数据库修改成功修改后的book为"+book);
        return "success";
    }
    /*
     * @Author GhostGalaxy
     * @Description //TODO
     * @Date 21:44:41 2022/11/27
     * @Param []
     * @return void
     **/
    @ModelAttribute
    public void getBookFromDataBase(Map<String,Object> map){
        //模拟先从从数据库查寻一下
        Book2 book2 = new Book2("三国演义", "施耐庵", 293.66, 98, 98);
        //这里相当于保存起来供修改方法封装数据时使用
        System.out.println("数据库查询到的数据是"+book2);
        map.put("book",book2);
        System.out.println("ModelAttribute方法...查询了图书并保存起来");

    }
}
