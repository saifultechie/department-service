package com.example.daily.coding.departmentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_address")
    private String departmentAddress;
    @Column(name = "department_code")
    private String departmentCode;
}
