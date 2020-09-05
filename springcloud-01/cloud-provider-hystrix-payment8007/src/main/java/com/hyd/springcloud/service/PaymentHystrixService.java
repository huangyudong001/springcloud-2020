package com.hyd.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author 黄玉东
 * @Date 2020/9/5 9:13
 * @Version 1.0
 */

@Service
public class PaymentHystrixService {

    //成功
    public String paymentInfo_OK(Integer id){
        return "线程池"+Thread.currentThread().getName()+"      paymentInfo_OK,id：  "+id+"\t"+"成功啦，哈哈哈";
    }

    //失败
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber=3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"      paymentInfo_TimeOut,id：  "+id+"\t"+"失败啦，呜呜呜"+"耗时（秒）"+timeNumber;

    }
}
