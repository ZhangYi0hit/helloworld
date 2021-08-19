package com.kuang.dao;

import com.kuang.pojo.Department;
import com.kuang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    @Autowired
    private DepartmentDao departmentDao;
    private static Map<Integer, Employee> employees=null;
    static {
        employees= new HashMap<Integer, Employee>();
        employees.put(10001,new Employee(10001,"baolan","baolan@gmail.com",1, new Department(101,"ig"), new Date("2000/12/12")));
        employees.put(10002,new Employee(10002,"xiaohu","baolan@gmail.com",1, new Department(102,"rng"), new Date("2001/12/12")));
        employees.put(10003,new Employee(10003,"ming","baolan@gmail.com",1, new Department(102,"rng"), new Date("2001/12/12")));
        employees.put(10004,new Employee(10004,"lwx","baolan@gmail.com",1, new Department(103,"fpx"), new Date("2001/12/12")));
    }
    private static Integer initId=10005;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }
    public Collection<Employee> getAll(){
        return employees.values();
    }
    public Employee getById(Integer id){
        return employees.get(id);
    }
    public void delete(Integer id){
        employees.remove(id);
    }
}
