package com.hyd.springcloud.mapper;

import com.hyd.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 黄玉东
 * @Date 2020/8/28 17:19
 * @Version 1.0
 */
public interface PaymentMapper {

    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
