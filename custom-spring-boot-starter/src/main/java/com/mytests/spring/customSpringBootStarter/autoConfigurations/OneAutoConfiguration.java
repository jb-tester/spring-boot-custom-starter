package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigOne;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromDeprecatedAndReplacedConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration(after= DeprecatedAutoConfiguration.class, beforeName = "com.mytests.spring.customSpringBootStarter.autoConfigurations.TwoAutoConfiguration")
public class OneAutoConfiguration {

    @Bean @ConditionalOnBean(BeanFromDeprecatedAndReplacedConfig.class)
    public BeanFromConfigOne myBeanOne(BeanFromDeprecatedAndReplacedConfig bean) {
        return new BeanFromConfigOne("bean from OneAutoConfiguration depending on " +bean.getStr());
    }
}
