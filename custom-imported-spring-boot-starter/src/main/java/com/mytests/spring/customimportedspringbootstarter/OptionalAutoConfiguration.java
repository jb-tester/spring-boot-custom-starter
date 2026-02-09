package com.mytests.spring.customimportedspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "custom.props.prop1", havingValue = "foo")
public class OptionalAutoConfiguration {
    @Bean
    public OptionalBean myOptionalBean() {
        return new OptionalBean();
    }
}
