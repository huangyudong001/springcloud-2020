package com.hyd.springcloud.mapper;

import com.hyd.springcloud.bean.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 黄玉东
 * @Date 2020/10/9 11:16
 * @Version 1.0
 */
public interface OrderMapper {

    //新建订单
    public int create(Order order);

    //修改订单状态，从零改为1
    public int update(@Param("userId") Long userId, @Param("status") Integer status);
}
