package com.hyd.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 黄玉东
 * @Date 2020/9/3 20:45
 * @Version 1.0
 */

@Configuration
public class RoundRobinRuleConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule(); // 定义随机的负载均衡机制
    }
}
