package com.itheima.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.itheima.entity.Department;
import com.itheima.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    //模拟数据库的数据在类加载的时候就创建
    static {
        employees = new HashMap<Integer, Employee>();

        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1, new Department(101, "D-AA")));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1, new Department(102, "D-BB")));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0, new Department(103, "D-CC")));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0, new Department(104, "D-DD")));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1, new Department(105, "D-EE")));
    }

    // 模拟一个初始化的自增id
    private static Integer initId = 1006;

    //保存或者更新(覆盖操作) 二和一的方法
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    //查询所有员工
    public Collection<Employee> getAll() {
        return employees.values();
    }

    //根据id查询员工
    public Employee get(Integer id) {
        return employees.get(id);
    }

    //删除一个员工
    public void delete(Integer id) {
        employees.remove(id);
    }
}
