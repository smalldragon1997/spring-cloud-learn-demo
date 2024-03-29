package com.wxl.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.wxl"})
public class Provider1Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class, args);
    }

}
