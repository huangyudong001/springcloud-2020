package com.hyd.springcloud.service;

/**
 * @Author 黄玉东
 * @Date 2020/11/10 17:21
 * @Version 1.0
 */
public interface StorageService {

    // 扣减库存
    public int decrease(Long productId, Integer count);
}
