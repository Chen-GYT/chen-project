package com.chen.order.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: cloud-boot-demo
 * @Description: TODO
 * @Author: 陈亮平
 * @Date: 2020/12/30 17:14
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args);
    }

}
