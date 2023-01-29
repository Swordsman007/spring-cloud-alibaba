package com.wp.seataatfegindemoordersvc.feign.dto;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/19
 * @Version V1.0
 */
public class AccountReduceBalanceDTO {

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 扣减金额
     */
    private Integer price;

    public Long getUserId() {
        return userId;
    }

    public AccountReduceBalanceDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public AccountReduceBalanceDTO setPrice(Integer price) {
        this.price = price;
        return this;
    }
}
