package com.hyd.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author 黄玉东
 * @Date 2020/9/4 14:24
 * @Version 1.0
 */
public interface LoadBalancer {

    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
