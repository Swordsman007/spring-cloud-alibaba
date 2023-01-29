package com.wp.openfeginconsumer.controller;

import com.wp.openfeginapi.api.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/17
 * @Version V1.0
 */
@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Resource
    private ProviderService providerService;

    @GetMapping ("/callProvider")
    public String callProvider() {
        //使用Feign客户端调用其他服务的接口
        return providerService.list();
    }

    @GetMapping ("/callProvider2")
    public String callProvider2() {
        //使用Feign客户端调用其他服务的接口
        return providerService.rongduan();
    }
}
