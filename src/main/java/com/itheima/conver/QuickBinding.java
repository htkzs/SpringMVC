package com.itheima.conver;


import com.itheima.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class QuickBinding {
    /*
     * @Author GhostGalaxy
     * @Description 增加一个方法用于快速将表单数据和实体类对象属性绑定 进行自定义的类型转换
     * @Date 20:26:55 2022/12/10
     * @Param [data]
     * @return void
     **/

    @RequestMapping("/emp/convertor")
    public void quickConvertor(@RequestParam("dataString") Employee employee) {
        System.out.println(employee);
    }
}
