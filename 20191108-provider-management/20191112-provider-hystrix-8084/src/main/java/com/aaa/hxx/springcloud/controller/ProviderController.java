package com.aaa.hxx.springcloud.controller;

import com.aaa.hxx.springcloud.model.User;
import com.aaa.hxx.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/12
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class ProviderController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallBack")
    public List<User> selectAllBooks() throws Exception {
        List<User> users = iUserService.selectAllUsers();
        if(users.size() > 0) {
            throw new Exception("模拟异常，测试熔断处理！");
        }
        return users;
    }
}
