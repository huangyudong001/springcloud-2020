package com.hyd.springcloud.service;

import com.hyd.springcloud.bean.CommonResult;
import com.hyd.springcloud.bean.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author 黄玉东
 * @Date 2020/9/30 10:32
 * @Version 1.0
 */

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}

