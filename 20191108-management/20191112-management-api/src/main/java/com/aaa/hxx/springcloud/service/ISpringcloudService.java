package com.aaa.hxx.springcloud.service;

import com.aaa.hxx.springcloud.fallback.ISpringcloudFallbackFactory;
import com.aaa.hxx.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/12
 * PROJECTnNAME:20191108-springcloud
 */
@FeignClient( value = "USER-PROVIDER",fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringcloudService {
    @RequestMapping("/all")
    List<User> selectAllUsers();
}
