package com.hyd.springcloud.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author 黄玉东
 * @Date 2020/10/26 20:57
 * @Version 1.0
 */
public interface StorageMapper {
    //扣减库存信息
    public int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
