package com.mytests.spring.customSpringBootStarter.beans;


public class BeanFromConfigTwo {
    private final String str;

    public BeanFromConfigTwo(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "BeanFromConfigTwo{" +
               "str='" + str + '\'' +
               '}';
    }
}
