package com.linilq.feign.impl;

import com.linilq.entity.Student;
import com.linilq.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/13
 */
@Component
public class FeignProviderClientError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中";
    }

    @Override
    public Collection<Student> findAll() {
        return new ArrayList<>();
    }
}
