package com.mytests.spring.customSpringBootStarter.autoConfigurations;

import com.mytests.spring.customSpringBootStarter.CustomConfigProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties(CustomConfigProperties.class)
public class MainCustomAutoConfiguration {
}
