package com.mytests.spring.usecustomstarter;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigOne;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigTwo;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromDeprecatedAndReplacedConfig;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromNestedConfig;
import com.mytests.spring.customimportedspringbootstarter.LibBean0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class UseBeansFromAutoconfiguration {

    @Autowired
    Optional<BeanFromConfigOne> beanOne;
    @Autowired
    private Optional<BeanFromConfigTwo> beanTwo;
    @Autowired
    private Optional<BeanFromNestedConfig> beanFromNestedConfig;
    @Autowired
    private Optional<BeanFromDeprecatedAndReplacedConfig> replacementBean;
    @Autowired
    private Optional<LibBean0> libBean0;

    public String getBeanOne() {
        return beanOne.map(BeanFromConfigOne::getStr).orElse("not autowired");
    }

    public String getBeanTwo() {
        return beanTwo.map(Object::toString).orElse("not autowired");
    }

    public String getBeanFromNestedConfig() {
        return beanFromNestedConfig.map(Object::toString).orElse("not autowired");
    }

    public String getReplacementBean() {
        return replacementBean.map(Object::toString).orElse("not autowired");
    }

    public LibBean0 getLibBean0() {
        return libBean0.orElse(null);
    }

    @Override
    public String toString() {
        return "UseBeansFromAutoconfiguration{" +
               "beanOne is " + getBeanOne() +
               ", beanTwo is " + getBeanTwo() +
               ", beanFromNestedConfig is " + getBeanFromNestedConfig() +
               ", replacementBean is " + getReplacementBean() +
               ", bean from another module is " + getLibBean0() +
               '}';
    }
}
