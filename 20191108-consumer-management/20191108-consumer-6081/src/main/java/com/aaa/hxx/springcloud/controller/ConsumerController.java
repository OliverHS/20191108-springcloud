package com.aaa.hxx.springcloud.controller;

import com.aaa.hxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * Author:HXX
 * Description:
 * DATE:2019/11/8
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<User> selectAllUsers(){
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}
