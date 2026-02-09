
package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromDeprecatedAndReplacedConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class ReplacementAutoConfiguration {

    @Bean
    public BeanFromDeprecatedAndReplacedConfig myReplacementBean() {
        return new BeanFromDeprecatedAndReplacedConfig("bean from ReplacementAutoConfiguration");
    }
}
