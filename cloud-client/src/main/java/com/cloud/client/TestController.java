package com.cloud.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: cloud-boot-demo
 * @Description: TODO
 * @Author: 陈亮平
 * @Date: 2020/12/15 16:44
 * @Version: v1.0
 */
@RestController("/payment")
public class TestController {
    @GetMapping("/doPayment")
    public String doPayment() {
        return "支付成功";
    }
}
