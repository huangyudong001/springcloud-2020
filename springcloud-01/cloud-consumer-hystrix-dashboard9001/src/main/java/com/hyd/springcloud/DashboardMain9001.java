package com.hyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author 黄玉东
 * @Date 2020/9/5 17:02
 * @Version 1.0
 */

@SpringBootApplication
@EnableHystrixDashboard  //表示开启服务监控hystrixDashboard
public class DashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(DashboardMain9001.class,args);
    }
}
