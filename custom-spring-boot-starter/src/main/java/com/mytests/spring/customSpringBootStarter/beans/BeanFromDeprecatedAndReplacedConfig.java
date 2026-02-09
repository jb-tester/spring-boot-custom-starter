package com.mytests.spring.customSpringBootStarter.beans;


public class BeanFromDeprecatedAndReplacedConfig {
    private final String str;

    public BeanFromDeprecatedAndReplacedConfig(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "BeanFromDeprecatedAndReplacedConfig{" +
               "str='" + str + '\'' +
               '}';
    }
}
