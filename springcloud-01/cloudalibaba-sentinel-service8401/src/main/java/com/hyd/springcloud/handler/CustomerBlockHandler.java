package com.hyd.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hyd.springcloud.bean.CommonResult;
import com.hyd.springcloud.bean.Payment;

/**
 * @Author 黄玉东
 * @Date 2020/9/29 17:00
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按照客户自定义的Glogal 全局异常处理 ---- 1", new Payment(2020L, "serial003"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按照客户自定义的Glogal 全局异常处理 ---- 2", new Payment(2020L, "serial003"));
    }
}



