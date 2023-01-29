package com.wp.openfeginapi.api;


import com.wp.openfeginapi.api.fallback.DemoProviderFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//会扫描指定包下，标记FeignClient注解的接口
//会根据服务名，从注册中心找到对应的IP地址
@FeignClient(name = "fegin-provider",fallbackFactory = DemoProviderFeignClientFallbackFactory.class)
public interface ProviderService {

    //这里跟提供者接口的URL一致
    @GetMapping("/provider/list")
    String list();

    @GetMapping("/provider/rongduan")
    String rongduan();
}
