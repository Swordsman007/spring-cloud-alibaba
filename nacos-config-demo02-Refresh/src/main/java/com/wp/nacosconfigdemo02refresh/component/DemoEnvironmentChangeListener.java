package com.wp.nacosconfigdemo02refresh.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Roark
 * @Date: 2023/1/16
 * @Version V1.0
 */
@Component
public class DemoEnvironmentChangeListener implements ApplicationListener<EnvironmentChangeEvent> {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ConfigurableEnvironment environment;


    /**
     * 事件监听机制，获取最新更改的配置项
     * @param environmentChangeEvent
     */
    public void onApplicationEvent(EnvironmentChangeEvent environmentChangeEvent) {
        for (String key : environmentChangeEvent.getKeys()) {
            logger.info("[onApplicationEvent][key({}) 最新 value 为 {}]", key, environment.getProperty(key));
        }
    }
}
