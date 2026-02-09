package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigOne;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigTwo;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration(after = OneAutoConfiguration.class)
public class TwoAutoConfiguration {
    @Bean @ConditionalOnBean(name = "myBeanOne")
    public BeanFromConfigTwo myBeanTwo(BeanFromConfigOne myBeanOne) {
        return new BeanFromConfigTwo("bean from TwoAutoConfiguration depending on " +myBeanOne.getStr());
    }
}
