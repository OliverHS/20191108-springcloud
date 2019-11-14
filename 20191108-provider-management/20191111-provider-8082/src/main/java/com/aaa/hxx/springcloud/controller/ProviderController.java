package com.aaa.hxx.springcloud.controller;

import com.aaa.hxx.springcloud.model.User;
import com.aaa.hxx.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/8
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class ProviderController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/all")
    public List<User> selectAllUsers(){
        return iUserService.selectAllUsers();
    }
}
