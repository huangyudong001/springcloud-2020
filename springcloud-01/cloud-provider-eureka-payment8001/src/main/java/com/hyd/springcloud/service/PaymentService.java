package com.hyd.springcloud.service;

import com.hyd.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 黄玉东
 * @Date 2020/8/31 11:36
 * @Version 1.0
 */
public interface PaymentService {
    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
