package com.mytests.spring.customSpringBootStarter.beans;


public class BeanFromConfigThree2 {
    private final BeanFromConfigThree1 bean1;

    public BeanFromConfigThree2(BeanFromConfigThree1 beanFromConfigThree1) {
        this.bean1 = beanFromConfigThree1;
    }
}
