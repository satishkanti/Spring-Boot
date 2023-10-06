package com.kanti.cruddemo.dao;

import java.util.List;

import com.kanti.cruddemo.entity.Student;

public interface StudentDAO {
    
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
