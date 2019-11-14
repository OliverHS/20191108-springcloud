package com.aaa.hxx.springcloud.service;


import com.aaa.hxx.springcloud.mapper.UserMapper;
import com.aaa.hxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/10/24
 * PROJECTnNAME:my-dubbo-provider
 */
@Service
public class IUserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUsers(){
        return userMapper.selectAll();

    }
}
