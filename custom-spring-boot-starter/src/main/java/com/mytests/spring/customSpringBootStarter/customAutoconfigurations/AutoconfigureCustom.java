package com.mytests.spring.customSpringBootStarter.customAutoconfigurations;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ImportAutoConfiguration
public @interface AutoconfigureCustom {
}
