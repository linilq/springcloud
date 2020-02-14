package com.linilq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/14
 */
@RestController
@RequestMapping("nativeconfigclient")
public class NativeConfigClientController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    @RequestMapping("index")
    public String index() {

        return "端口号：" + port + ",foo" + foo;
    }
}
