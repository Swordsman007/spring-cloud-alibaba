package com.wp.seataatfegindemoprodutsvc.controller;

import com.wp.seataatfegindemoprodutsvc.dto.ProductReduceStockDTO;
import com.wp.seataatfegindemoprodutsvc.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/20
 * @Version V1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @PostMapping("/reduce-stock")
    public void reduceStock(@RequestBody ProductReduceStockDTO productReduceStockDTO)
            throws Exception {
        logger.info("[reduceStock] 收到减少库存请求, 商品:{}, 价格:{}", productReduceStockDTO.getProductId(),
                productReduceStockDTO.getAmount());
        productService.reduceStock(productReduceStockDTO.getProductId(), productReduceStockDTO.getAmount());
    }
}