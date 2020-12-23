package com.example.web.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: demo-web
 * @Description: TODO
 * @Author: 陈亮平
 * @Date: 2020/12/16 17:06
 * @Version: v1.0
 */
@Controller
public class TestController {
    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "hello world";
    }
    @GetMapping("/doPayment")
    @ResponseBody
    public String doPayment() {
        return "支付成功";
    }
}
