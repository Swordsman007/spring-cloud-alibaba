package com.wp.dubboprovider.service;

import com.wp.dubboapi.UserService;
import dto.UserAddDTO;
import dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/17
 * @Version V1.0
 */
@DubboService(protocol = "dubbo",version = "1.0.0")
public class UserServiceImpl implements UserService {

    public UserDTO get(Integer id) {
        return new UserDTO().setId(id)
                .setName("没有昵称：" + id)
                .setGender(id % 2 + 1); // 1 - 男；2 - 女
    }

    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }
}
