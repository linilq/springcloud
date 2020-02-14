package com.linilq.feign;

import com.linilq.entity.Student;
import com.linilq.feign.impl.FeignProviderClientError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignProviderClientError.class)
public interface FeignProviderClient {

    @GetMapping("/student/index")
    String index();

    @GetMapping("/student/findAll")
    Collection<Student> findAll();
}
