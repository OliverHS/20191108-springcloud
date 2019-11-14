package com.aaa.hxx.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/13
 * PROJECTnNAME:20191108-springcloud
 */
@RestController
public class ProviderController {
    @RequestMapping("/all")
    public List<String> selectAllString() {
        List<String> strList = new ArrayList<String>();
        String str = "12345678";
        strList.add(str);
        return strList;
    }
}
