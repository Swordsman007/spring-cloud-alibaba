package com.wp.seataatfegindemoordersvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SeataAtFeginDemoOrderSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataAtFeginDemoOrderSvcApplication.class, args);
    }

}
