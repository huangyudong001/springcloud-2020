package com.hyd.springcloud.service.impl;

import com.hyd.springcloud.maper.AccountMapper;
import com.hyd.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Author 黄玉东
 * @Date 2020/11/10 17:48
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired(required = false)
    private AccountMapper accountMapper;

    @Override
    public int decrease(Long userId, BigDecimal money) {

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return accountMapper.decrease(userId, money);
    }
}
