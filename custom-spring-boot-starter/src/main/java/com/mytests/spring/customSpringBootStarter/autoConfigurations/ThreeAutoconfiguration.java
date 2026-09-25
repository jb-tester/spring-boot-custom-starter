package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigThree1;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigThree2;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
//@Configuration(proxyBeanMethods = false)
public class ThreeAutoconfiguration {

    @Bean
    public BeanFromConfigThree1 beanFromConfigThree1() {
        return new BeanFromConfigThree1();
    }
    @Bean
    public BeanFromConfigThree2 beanFromConfigThree2() {
        return new BeanFromConfigThree2(beanFromConfigThree1()); // error should be reported!
    }
}
