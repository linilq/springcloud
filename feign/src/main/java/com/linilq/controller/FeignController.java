package com.linilq.controller;

import com.linilq.entity.Student;
import com.linilq.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/13
 */
@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    FeignProviderClient feignProviderClient;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("index")
    public String index() {
        return feignProviderClient.index();
    }
}
