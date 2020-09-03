package com.hyd.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value = "com.hyd.springcloud.mapper")
@EnableEurekaClient
public class PaymentEurekaMain802 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentEurekaMain802.class, args);
    }
}
