package com.chen.order.server.test;

import com.chen.order.server.client.OrderPaymentClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: cloud-boot-demo
 * @Description: TODO
 * @Author: 陈亮平
 * @Date: 2020/12/30 17:19
 * @Version: v1.0
 */
@RestController
public class PaymentController {
    private final OrderPaymentClient paymentClient;

    public PaymentController(OrderPaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @GetMapping("test")
    public String test() {
        return paymentClient.test();
    }
}
