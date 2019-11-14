package com.aaa.hxx.springcloud;

import com.aaa.hxx.ribbon.RibbonRuleMine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/11
 * PROJECTnNAME:20191108-springcloud
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "USER-PROVIDER",configuration = RibbonRuleMine.class)
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }
}
