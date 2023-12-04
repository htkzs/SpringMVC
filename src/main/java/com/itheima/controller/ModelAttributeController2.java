package com.itheima.controller;

import com.itheima.entity.Book;
import com.itheima.entity.Book2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

/**
 * @ClassName ModelAttributeController2 @ModelAttribute原理
 * @Description TODO
 * @Author 20609
 * @Date 2023/12/3 16:38
 * @Version 1.0
 */
@Controller
@RequestMapping("/model")
public class ModelAttributeController2 {

    /*
     * @Author GhostGalaxy
     * @Description 增加了@ModelAttribute 的对象是从数据库中查出来的（实质上是从隐含模型中取出来的） 而不是新new对象
     * 测试数据：数据库修改成功修改后的book为Book2(bookName=三国演义, author=吴承恩, price=29.8, stock=99, sales=99) 发现前端bookName传入null但取的是数据库的
     * 结合@SessionAttribute使用：
     *     如果使用 @ModelAttribute("book2")取值放到参数中 但是隐含模型中设置的key 是@ModelAttribute("haha") 那么此时会从 @SessionAttribute中取值，session中如果没有就会报异常。
     * @Date 21:52:25 2022/11/27
     * @Param [book]
     * @return java.lang.String
     **/
    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("book2") Book2 book) {
        book.setAuthor("吴承恩");
        book.setPrice(29.8);
        /*
        其它字段不做修改 检测没有修改的字段是不是会沿用数据库的字段
         */
        System.out.println("数据库修改成功修改后的book为" + book);
        return "success";
    }

    /*
     * @Author GhostGalaxy
     * @Description @ModelAttribute 标注的方法会提前运行并把方法的运行结果放在隐含模型中;
                    放的时候会使用一个key;
                    如果@ModelAttribute( "book")指定了，就用指定的book;如果没指定就用返回值类型的首字母小写作为key;
     * @Date 21:44:41 2022/11/27
     * @Param []
     * @return void
     **/

    @ModelAttribute("haha")
    public Book2 getBookFromDataBase(Map<String, Object> map) {
        //模拟先从从数据库查寻一下
        Book2 book2 = new Book2("三国演义", "施耐庵", 293.66, 98, 98);
        //这里相当于保存起来供修改方法封装数据时使用
        System.out.println("数据库查询到的数据是" + book2);
        System.out.println("ModelAttribute方法...查询了图书并保存起来");
        return book2;
    }
}
