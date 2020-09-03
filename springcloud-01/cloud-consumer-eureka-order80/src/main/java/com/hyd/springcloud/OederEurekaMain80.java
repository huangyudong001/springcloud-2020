package com.hyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 17:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OederEurekaMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OederEurekaMain80.class, args);
    }
}
