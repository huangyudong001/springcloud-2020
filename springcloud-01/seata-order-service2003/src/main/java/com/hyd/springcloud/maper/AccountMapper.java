package com.hyd.springcloud.maper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author 黄玉东
 * @Date 2020/11/10 17:45
 * @Version 1.0
 */
public interface AccountMapper {

    /**
     * 扣减账户余额
     */
    public int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
