package com.hyd.springcloud.controller;

import com.hyd.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄玉东
 * @Date 2020/9/5 9:21
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_OK(id);
        log.info("--------------result-----："+result);
        return  result;
    }

    @GetMapping("/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("--------------result-----：" + result);
        return result;
    }
}
