package com.hyd.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author 黄玉东
 * @Date 2020/9/5 14:58
 * @Version 1.0
 */
@Component
public class OrderFallbackService implements OrderHystrixServicr{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_timeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
