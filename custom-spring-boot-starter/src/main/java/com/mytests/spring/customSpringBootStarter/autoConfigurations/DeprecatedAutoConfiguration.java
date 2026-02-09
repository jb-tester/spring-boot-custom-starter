
package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromDeprecatedAndReplacedConfig;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@Deprecated
public class DeprecatedAutoConfiguration {

    @Bean
    public BeanFromDeprecatedAndReplacedConfig myBeanFromDeprecatedConfig() {
        return new BeanFromDeprecatedAndReplacedConfig("bean from DeprecatedAutoConfiguration");
    }
}
