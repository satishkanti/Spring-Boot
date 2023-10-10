package com.kanti.springboot.cruddemo.dao;

import java.util.List;

import com.kanti.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
    
    List<Employee> findAll();
}
