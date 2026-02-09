package com.mytests.spring.customSpringBootStarter.autoConfigurations;


import com.mytests.spring.customSpringBootStarter.beans.BeanFromNestedConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

public class Foo {


    // no gutter action to navigate to *.imports file
    @AutoConfiguration
    public static class NestedAutoConfiguration {

        @Bean
        public BeanFromNestedConfig myBeanFromNestedConfig() {
            return new BeanFromNestedConfig();
        }
    }
}
