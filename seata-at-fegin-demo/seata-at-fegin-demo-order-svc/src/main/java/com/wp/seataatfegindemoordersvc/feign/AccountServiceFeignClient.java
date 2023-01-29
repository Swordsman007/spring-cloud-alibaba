package com.wp.seataatfegindemoordersvc.feign;

import com.wp.seataatfegindemoordersvc.feign.dto.AccountReduceBalanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/19
 * @Version V1.0
 */
@FeignClient(name = "account-service")
public interface AccountServiceFeignClient {

    @PostMapping("/account/reduce-balance")
    void reduceBalance(@RequestBody AccountReduceBalanceDTO accountReduceBalanceDTO);
}
