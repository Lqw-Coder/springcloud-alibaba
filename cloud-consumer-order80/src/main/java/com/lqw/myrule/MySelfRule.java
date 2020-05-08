package com.lqw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//负载均衡更改算法时不能在ComponentScan包下被扫描
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
