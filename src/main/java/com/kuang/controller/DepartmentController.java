package com.kuang.controller;

import com.kuang.mapper.DepartmentMapper;
import com.kuang.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

//    @Autowired
//    DepartmentMapper departmentMapper;
//
//    // 查询全部部门
//    @GetMapping("/getDepartments")
//    public List<Department> getDepartments(){
//        return departmentMapper.getDepartments();
//    }
//
//    // 查询全部部门
//    @GetMapping("/getDepartment/{id}")
//    public Department getDepartment(@PathVariable("id") Integer id){
//        return departmentMapper.getDepartmentById(id);
//    }

}
