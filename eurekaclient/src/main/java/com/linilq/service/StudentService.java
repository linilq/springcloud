package com.linilq.service;

import com.linilq.entity.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> findAll();
    String insert(Student student);
}
