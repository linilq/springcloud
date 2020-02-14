package com.linilq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/14
 */
@SpringBootApplication
@EnableConfigServer  // 声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
