package com.wp.nacosdiscoverydemo02provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/16
 * @Version V1.0
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/echo")
    public String test(String name) {
        return "provider:" + name;
    }

}
