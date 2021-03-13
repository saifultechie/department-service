package com.example.daily.coding.departmentservice.controller;

import com.example.daily.coding.departmentservice.entity.Department;
import com.example.daily.coding.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DeparmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("inside from deparment controller");
        return departmentService.saveData(department);
    }
    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId)
    {
       return departmentService.findDepartmentById(departmentId);

    }
}
