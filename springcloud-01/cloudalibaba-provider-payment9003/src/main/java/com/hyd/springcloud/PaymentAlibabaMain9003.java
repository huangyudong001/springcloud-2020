package com.hyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 黄玉东
 * @Date 2020/9/29 19:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain9003.class,args);
    }
}
