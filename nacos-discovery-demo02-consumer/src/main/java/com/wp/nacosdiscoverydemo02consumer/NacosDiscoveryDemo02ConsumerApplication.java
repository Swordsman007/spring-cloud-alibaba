package com.wp.nacosdiscoverydemo02consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NacosDiscoveryDemo02ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryDemo02ConsumerApplication.class, args);
    }

    @Configuration
    public class RestTemplateConfig {

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

}
