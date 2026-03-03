package com.mytests.spring.customimportedspringbootstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
public class FromOtherModuleConfiguration {

    @Bean
    public LibBean0 libBean0() {
        return new LibBean0();
    }
}
