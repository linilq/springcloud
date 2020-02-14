package com.linilq.controller;

import com.linilq.entity.Student;
import com.linilq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/12
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Value("${server.port}")
    String port;

    @GetMapping("index")
    public String index() {
        return port;
    }

    @GetMapping("findAll")
    public Collection<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping("insert")
    public String insert(@RequestBody Student student) {
        return studentService.insert(student);
    }
}
