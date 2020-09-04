package com.hyd.springcloud;

import com.hyd.springcloud.config.RoundRobinRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 17:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = RoundRobinRuleConfig.class)
public class OederEurekaMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OederEurekaMain80.class, args);
    }
}
