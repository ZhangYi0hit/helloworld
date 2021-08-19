package com.kuang.dao;

import com.kuang.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments=null;
    static {
        departments=new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"ig"));
        departments.put(102,new Department(102,"rng"));
        departments.put(103,new Department(103,"fpx"));
        departments.put(104,new Department(104,"dk"));
    }
    public Collection<Department> getAll(){
        return departments.values();
    }
    public Department getById(Integer id){
        return departments.get(id);

    }
}
