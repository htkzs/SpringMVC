package com.itheima.handler;

import com.itheima.dao.EmployeeDao;
import com.itheima.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@Controller
public class AJAXController {
    @Autowired
    private EmployeeDao employeeDao;
    /*
     * @Author GhostGalaxy
     * @Description 返回JSON格式的数据
     * @Date 14:40:46 2022/12/11
     * @Param []
     * @return java.util.Collection<com.itheima.entity.Employee>
     **/
    @ResponseBody
    @RequestMapping("/getAll/employees")
    public Collection<Employee> getAllEmpForAJAX(){
        Collection<Employee> employees = employeeDao.getAll();
        return employees;
    }


}
