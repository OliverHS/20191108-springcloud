package com.aaa.hxx.springcloud.fallback;

import com.aaa.hxx.springcloud.model.User;
import com.aaa.hxx.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/12
 * PROJECTnNAME:20191108-springcloud
 */
@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringcloudService> {
    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<User> selectAllUsers() {
                System.out.println("我是测试熔断的方法，我被访问了，ISpringCloudService接口中的selectAllBooks方法抛出异常！");
                return null;
            }
        };
    }
}
