package com.aaa.hxx.springcloud.controller;

import com.aaa.hxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/11
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class ConsumerController {

    //private static final String URL = "http://localhost:8081/";
    private static final String URL = "http://USER-PROVIDER:8081/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/all")
    public List<User> selectAllUsers(){
        return restTemplate.getForObject(URL+"all", List.class);
    }

    @GetMapping("/allLB")
    public List<User> selectUsersByLoadBalance(){
        // 1.通过loadBalancerClient对象获取到所有的服务提供者的信息(8081,8082,8083)
        // application.properties配置文件中book-provider.ribbon.listOfServers=localhost:8081,localhost:8082,localhost:8083
        // 通过8081，8082，8083中spring.application.name获取到
        // serviceId--->key(choose(Object key))
        // key--->spring.application.name的值
        // serviceInstance:每一个Server对象
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");
        // 2.获取server的ip地址
        String host = serviceInstance.getHost();
        System.out.println(host);
        // 3.获取server的port
        int port = serviceInstance.getPort();
        System.out.println(port);
        // ip+port+requestMapping路径
        return restTemplate.getForObject("http://"+host+":"+port+"/all", List.class);
    }



}
