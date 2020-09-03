package com.hyd.springcloud.service.impl;

import com.hyd.springcloud.bean.Payment;
import com.hyd.springcloud.mapper.PaymentMapper;
import com.hyd.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 11:36
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired(required = false)
    private PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
