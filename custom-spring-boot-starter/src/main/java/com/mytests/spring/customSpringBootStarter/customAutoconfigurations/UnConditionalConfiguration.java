package com.mytests.spring.customSpringBootStarter.customAutoconfigurations;


import com.mytests.spring.customSpringBootStarter.beans.UnconditionalBeanForCustomAutoconfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnConditionalConfiguration {
    @Bean
    public UnconditionalBeanForCustomAutoconfiguration myUnconditionalBeanForCustomAutoconfiguration() {
        return new UnconditionalBeanForCustomAutoconfiguration();
    }
}
