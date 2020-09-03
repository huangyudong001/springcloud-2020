package com.hyd.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author 黄玉东
 * @Date 2020/9/3 11:13
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentZkController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/zk")
    public String paymentzk(){
        return "zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
