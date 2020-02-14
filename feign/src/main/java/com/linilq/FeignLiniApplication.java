package com.linilq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/13
 */
@SpringBootApplication
@EnableFeignClients
public class FeignLiniApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignLiniApplication.class,args);
    }
}
