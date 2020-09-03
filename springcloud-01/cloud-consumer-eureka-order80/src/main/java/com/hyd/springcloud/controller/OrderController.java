package com.hyd.springcloud.controller;

import com.hyd.springcloud.bean.CommonResult;
import com.hyd.springcloud.bean.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 20:18
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

//    private static final String PAYMENT_URL = "http://localhost:8001";
    // 注册在eureka上的地址
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/insert")
    public Object insert(Payment payment){
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> request =new HttpEntity<>(payment,httpHeaders);
        ResponseEntity<Object> response =restTemplate.postForEntity(PAYMENT_URL+"/payment/insert",request,Object.class);
        return response.getBody();
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/"+id, CommonResult.class);
    }
}
