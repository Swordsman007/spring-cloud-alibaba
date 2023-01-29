package com.wp.openfeginapi.api.fallback;

import com.wp.openfeginapi.api.ProviderService;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/18
 * @Version V1.0
 */
public class DemoProviderFeignClientFallback implements ProviderService {

    private Throwable throwable;

    public DemoProviderFeignClientFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    public String list() {
        return "fallback:" + throwable.getClass().getSimpleName();
    }

    public String rongduan() {
        return "fallback:rongduan：" + throwable.getClass().getSimpleName();
    }
}
