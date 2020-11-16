package com.hyd.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 黄玉东
 * @Date 2020/10/9 14:35
 * @Version 1.0
 */
@Configuration
@MapperScan({"com.hyd.springcloud.mapper"})
public class MyBatisConfig {
}
