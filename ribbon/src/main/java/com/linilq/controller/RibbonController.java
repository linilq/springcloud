package com.linilq.controller;

import com.linilq.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/13
 */
@RestController
@RequestMapping("ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;
    String url_prefix = "http://provider/student/";

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject(url_prefix+"findAll",Collection.class);
    }

    @GetMapping("index")
    public String index() {
        return restTemplate.getForObject(url_prefix+"index",String.class);
    }
}
