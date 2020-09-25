package com.hyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 黄玉东
 * @Date 2020/9/25 11:01
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentAlibabaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain9001.class,args);
    }
}
