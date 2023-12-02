package com.itheima.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : NullPointerError
 * @Description : 模拟空指针异常 放问的URL http://localhost:8080/springmvc/err/page
 * @Author : 20609
 * @Date: 2022/12/12  17:51
 */
@Controller
public class NullPointerError {

    @RequestMapping("/err/page")
    public String getNullPointer() {
        String attr = null;
        if (attr.equals("admin")) {
            return "success";
        }
        return null;
    }
}
