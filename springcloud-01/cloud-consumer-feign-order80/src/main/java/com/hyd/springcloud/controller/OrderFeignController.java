package com.hyd.springcloud.controller;

import com.hyd.springcloud.bean.CommonResult;
import com.hyd.springcloud.server.OrderFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄玉东
 * @Date 2020/9/4 16:59
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderFeignController {
    @Autowired
    private OrderFeignService orderFeignService;

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return orderFeignService.getPaymentById(id);
    }
}
