package com.linilq.service.impl;

import com.linilq.entity.Student;
import com.linilq.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/12
 */
@Service
public class StudentServiceImpl implements StudentService {

    public static List<Student> list = new ArrayList<>();

    static {
        list.add(new Student(1, "linilq", 29));
        list.add(new Student(2, "huaqing", 19));
        list.add(new Student(3, "jiashu", 30));
        list.add(new Student(4, "bairen", 17));
    }

    @Override
    public Collection<Student> findAll() {
        return list;
    }

    @Override
    public String insert(Student student) {
        list.add(student);
        return "success";
    }
}
