package com.lqw.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced//自定义轮询算法后不能开启负载均衡功能，否则只认服务名
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
