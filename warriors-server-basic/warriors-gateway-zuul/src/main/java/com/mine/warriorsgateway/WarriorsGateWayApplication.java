package com.mine.warriorsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@RefreshScope
public class WarriorsGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarriorsGateWayApplication.class, args);
    }

}
