package com.hyd.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 黄玉东
 * @Date 2020/9/2 20:17
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/orderConsul")
public class OrderZkController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consul")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }

}
