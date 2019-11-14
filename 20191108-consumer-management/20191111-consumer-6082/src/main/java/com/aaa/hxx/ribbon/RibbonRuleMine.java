package com.aaa.hxx.ribbon;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:HXX
 * Description:
 * DATE:2019/11/11
 * PROJECTnNAME:20191108-springcloud
 */
@Configuration
public class RibbonRuleMine {
    @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }
}
