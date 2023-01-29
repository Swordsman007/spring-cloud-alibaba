package com.wp.openfeginapi.api.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/18
 * @Version V1.0
 */
@Component
public class DemoProviderFeignClientFallbackFactory implements FallbackFactory<DemoProviderFeignClientFallback> {


    public DemoProviderFeignClientFallback create(Throwable throwable) {
        return new DemoProviderFeignClientFallback(throwable);
    }
}
