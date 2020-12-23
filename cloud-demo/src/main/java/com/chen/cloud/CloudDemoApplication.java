package com.chen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author admin
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoApplication.class, args);
    }

}
