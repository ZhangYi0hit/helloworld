package com.kuang.controller;

import com.kuang.dao.DepartmentDao;
import com.kuang.dao.EmployeeDao;
import com.kuang.pojo.Department;
import com.kuang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/board/employeeList")
    public String employee(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("list",employees);
        return "employee";
    }
    @RequestMapping("/board/add")
    public String add(Model model){
        Collection<Department> departments = departmentDao.getAll();
        model.addAttribute("departments",departments);
        return "addEmployee";
    }
      @PostMapping("/yes")
    public String addSuccess(Employee employee){
        employeeDao.save(employee);

          return "redirect:/board/employeeList";
      }
      @GetMapping("/employeeUpdate/{id}")
    public String update(@PathVariable("id") Integer id,Model model){
          Collection<Department> departments = departmentDao.getAll();
          model.addAttribute("departments",departments);
          Employee employee = employeeDao.getById(id);
          model.addAttribute("employee",employee);
          return "update";

      }
      @RequestMapping("/employeeDelete/{id}")
    public String delete(@PathVariable("id") Integer id,Model model){
        employeeDao.delete(id);
          return "redirect:/employeeList";

      }





}
