package com.wp.openfeginprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/17
 * @Version V1.0
 */
@RestController
@RequestMapping("provider")
public class ProviderController{

    @GetMapping("/list")
    public String list() {
        List<String> list = new ArrayList<String>();
        list.add("java技术爱好者");
        list.add("SpringCloud");
        return list.toString();
    }

    @GetMapping("/rongduan")
    public String rongduan() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<String> list = new ArrayList<String>();
        list.add("熔断发挥正常");
        return list.toString();
    }
}
