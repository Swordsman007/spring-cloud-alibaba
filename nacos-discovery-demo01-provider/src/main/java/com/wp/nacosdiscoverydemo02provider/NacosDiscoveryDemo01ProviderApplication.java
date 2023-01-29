package com.wp.nacosdiscoverydemo02provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryDemo01ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryDemo02ProviderApplication.class, args);
    }

}
