package com.hyd.springcloud.service.impl;

import com.hyd.springcloud.bean.Order;
import com.hyd.springcloud.mapper.OrderMapper;
import com.hyd.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄玉东
 * @Date 2020/10/9 11:49
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Override
    public int create(Order order) {
        return orderMapper.create(order);
    }
}
