package com.wp.seataatfegindemoordersvc.service.impl;

import com.wp.seataatfegindemoordersvc.dao.OrderDao;
import com.wp.seataatfegindemoordersvc.entity.OrderDO;
import com.wp.seataatfegindemoordersvc.feign.AccountServiceFeignClient;
import com.wp.seataatfegindemoordersvc.feign.ProductServiceFeignClient;
import com.wp.seataatfegindemoordersvc.feign.dto.AccountReduceBalanceDTO;
import com.wp.seataatfegindemoordersvc.feign.dto.ProductReduceStockDTO;
import com.wp.seataatfegindemoordersvc.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/19
 * @Version V1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private AccountServiceFeignClient accountService;
    @Autowired
    private ProductServiceFeignClient productService;

    @GlobalTransactional
    public Integer createOrder(Long userId, Long productId, Integer price) {
        Integer amount = 1; // 购买数量，暂时设置为 1。

        logger.info("[createOrder] 当前 XID: {}", RootContext.getXID());

        // 扣减库存
        productService.reduceStock(new ProductReduceStockDTO().setProductId(productId).setAmount(amount));

        // 扣减余额
        accountService.reduceBalance(new AccountReduceBalanceDTO().setUserId(userId).setPrice(price));

        // 保存订单
        OrderDO order = new OrderDO().setUserId(userId).setProductId(productId).setPayAmount(amount * price);
        orderDao.saveOrder(order);
        logger.info("[createOrder] 保存订单: {}", order.getId());

        // 返回订单编号
        return order.getId();
    }
}
