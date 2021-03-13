package com.example.daily.coding.departmentservice.service;

import com.example.daily.coding.departmentservice.entity.Department;
import com.example.daily.coding.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveData(Department department) {
        log.info("inside from deparment service");
       return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }
}
