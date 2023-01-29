package com.wp.openfeginconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients(basePackages = {"com.wp.openfeginapi.api"})
@SpringBootApplication
@ComponentScan("com.wp")
public class OpenfeginConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeginConsumerApplication.class, args);
    }

}


