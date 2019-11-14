package com.aaa.hxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/14
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;


    @RequestMapping("/test")
    public String test() {
        return port + "-----" + driverClassName;
    }
}
