package com.xu.custermer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

        @SpringBootApplication
        @EnableEurekaClient//启用注册已发现
        @EnableFeignClients (basePackages = "com.xu.custermer.feign")
        @EnableDiscoveryClient
        @EnableHystrixDashboard
        @EnableCircuitBreaker
public class CustermerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustermerApplication.class, args);
    }

}
