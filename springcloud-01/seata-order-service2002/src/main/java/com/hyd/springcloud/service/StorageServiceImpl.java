package com.hyd.springcloud.service;

import com.hyd.springcloud.mapper.StorageMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄玉东
 * @Date 2020/11/10 17:22
 * @Version 1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService{

    @Autowired(required = false)
    private StorageMapper storageMapper;


    @Override
    public int decrease(Long productId, Integer count) {
        return storageMapper.decrease(productId,count);
    }
}
