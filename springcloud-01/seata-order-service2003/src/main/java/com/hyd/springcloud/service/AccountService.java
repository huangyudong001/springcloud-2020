package com.hyd.springcloud.service;


import java.math.BigDecimal;

/**
 * @Author 黄玉东
 * @Date 2020/11/10 17:46
 * @Version 1.0
 */
public interface AccountService {

    public int decrease(Long userId, BigDecimal money);
}
