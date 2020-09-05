package com.hyd.springcloud.controller;

import com.hyd.springcloud.service.OrderHystrixServicr;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄玉东
 * @Date 2020/9/5 11:03
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderHystrixController {

    @Autowired
    private OrderHystrixServicr orderHystrixServicr;


    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return orderHystrixServicr.paymentInfo_OK(id);
    }

    @GetMapping("/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id){
        return orderHystrixServicr.paymentInfo_timeOut(id);
    }
}
