package com.himanshu.SpringBootDemo1.service;

import com.himanshu.SpringBootDemo1.entity.Department;
import com.himanshu.SpringBootDemo1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
