package com.hyd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄玉东
 * @Date 2020/9/17 15:34
 * @Version 1.0
 */
@RefreshScope  //做动态刷新注解  使用curl -X POST “http://localhost:3355/actuator/refresh”
@RestController
public class ConfigClientController {

    // 因为config仓库以rest形式暴露，所以所有客户端都可以通过config服务端访问到github上对应的文件信息
    @Value("${config.info}")  //这里是giehub上配置文件的信息
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return  configInfo;
    }
}
