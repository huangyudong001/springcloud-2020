package com.hyd.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 20:18
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {



    //此处用的是默认的轮询负载均衡
//    @LoadBalanced    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders(){
        return  new HttpHeaders();
    }
}
