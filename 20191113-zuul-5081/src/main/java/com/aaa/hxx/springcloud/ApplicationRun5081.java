package com.aaa.hxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/13
 * PROJECTnNAME:20191108-springcloud
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {
    public static void main(String[] args) {

        SpringApplication.run(ApplicationRun5081.class,args);
    }
}
