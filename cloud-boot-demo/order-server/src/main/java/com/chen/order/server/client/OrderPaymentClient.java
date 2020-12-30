package com.chen.order.server.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: cloud-boot-demo
 * @Description: TODO
 * @Author: 陈亮平
 * @Date: 2020/12/30 17:24
 * @Version: v1.0
 */
@FeignClient(name = "order-payment")
public interface OrderPaymentClient {
    /**
     * 测试
     *
     * @return
     */
    @GetMapping("/payment/test")
    public String test();
}
