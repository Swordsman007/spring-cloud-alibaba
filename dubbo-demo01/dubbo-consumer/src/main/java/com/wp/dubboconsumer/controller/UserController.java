package com.wp.dubboconsumer.controller;

import com.wp.dubboapi.UserService;
import dto.UserAddDTO;
import dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/17
 * @Version V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/get")
    public UserDTO get(@RequestParam("id") Integer id) {
        return userService.get(id);
    }

    @PostMapping("/add")
    public Integer add(UserAddDTO addDTO) {
        return userService.add(addDTO);
    }

}
