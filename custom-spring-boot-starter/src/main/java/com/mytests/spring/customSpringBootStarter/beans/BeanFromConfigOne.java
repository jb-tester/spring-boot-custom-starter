package com.mytests.spring.customSpringBootStarter.beans;


public class BeanFromConfigOne {

    private final String str;
    public BeanFromConfigOne(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "BeanFromConfigOne{" +
               "str='" + str + '\'' +
               '}';
    }
}
