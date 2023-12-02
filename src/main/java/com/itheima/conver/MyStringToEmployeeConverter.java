package com.itheima.conver;

import com.itheima.entity.Department;
import com.itheima.entity.Employee;
import org.springframework.core.convert.converter.Converter;

public class MyStringToEmployeeConverter implements Converter<String, Employee> {
    @Override
    public Employee convert(String s) {
        Employee emp = new Employee();
        if (s.contains("-")) {
            String[] split = s.split("-");
            emp.setLastName(split[0]);
            emp.setEmail(split[1]);
            emp.setGender(Integer.parseInt(split[2]));
            emp.setDepartment(new Department(1, "101"));
        }
        return emp;
    }
}
