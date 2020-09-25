package com.hyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 黄玉东
 * @Date 2020/9/25 14:47
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain9002.class,args);
    }
}
