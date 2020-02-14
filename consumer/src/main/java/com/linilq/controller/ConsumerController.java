package com.linilq.controller;

import com.linilq.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/12
 */
@RequestMapping("consume")
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    String url_prefix = "http://localhost:8010/student/";

    @GetMapping("findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity(url_prefix + "findAll", Collection.class).getBody();
    }

    @PostMapping("insert")
    public String insert(@RequestBody Student student, HttpServletRequest request) {
        return restTemplate.postForEntity(url_prefix + "insert", student, String.class).getBody();
    }

}
