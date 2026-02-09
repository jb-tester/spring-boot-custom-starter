package com.mytests.spring.customimportedspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "custom.props.prop2", havingValue = "bar")
public class LibAutoConfiguration {
    @Bean
    public LibBean myLibBean() {
        return new LibBean();
    }
}
