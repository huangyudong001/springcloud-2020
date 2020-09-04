package com.hyd.springcloud.controller;

import com.hyd.springcloud.bean.CommonResult;
import com.hyd.springcloud.bean.Payment;
import com.hyd.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 14:04
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment){
        int result = paymentService.insert(payment);
        log.info("-------------插入的结果-------"+result);
        if (result >0){
            return new CommonResult(200,"成功,serverPost："+serverPort,result);
        }
        return new CommonResult(444,"失败serverPost："+serverPort,null);
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("-------------查询的结果-------"+result);
        if (result != null){
            return new CommonResult(200,"成功serverPost："+serverPort,result);
        }
        return new CommonResult(444,"失败serverPost："+serverPort,null);
    }


    @GetMapping(value = "/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
