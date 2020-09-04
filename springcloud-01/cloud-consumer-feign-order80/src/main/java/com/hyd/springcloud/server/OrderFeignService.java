package com.hyd.springcloud.server;

import com.hyd.springcloud.bean.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 黄玉东
 * @Date 2020/9/4 16:57
 * @Version 1.0
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //自带负载均衡配置
public interface OrderFeignService {

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
