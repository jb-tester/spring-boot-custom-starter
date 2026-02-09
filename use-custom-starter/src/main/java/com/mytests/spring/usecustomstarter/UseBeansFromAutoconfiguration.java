package com.mytests.spring.usecustomstarter;

import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigOne;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromConfigTwo;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromDeprecatedAndReplacedConfig;
import com.mytests.spring.customSpringBootStarter.beans.BeanFromNestedConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UseBeansFromAutoconfiguration {

    @Autowired(required = false)
    BeanFromConfigOne beanOne;
    @Autowired(required = false)
    private BeanFromConfigTwo beanTwo;
    @Autowired(required = false)
    private BeanFromNestedConfig beanFromNestedConfig;
    @Autowired(required = false)
    private BeanFromDeprecatedAndReplacedConfig replacementBean;

    public String getBeanOne() {
        if (beanOne == null) {
            return "not autowired";
        }
        return beanOne.getStr();
    }

    public String getBeanTwo() {
        if (beanTwo == null) {
            return "not autowired";
        }
        return beanTwo.toString();
    }

    public String getBeanFromNestedConfig() {
        if (beanFromNestedConfig == null) {
            return "not autowired";
        }
        return beanFromNestedConfig.toString();
    }

    public String getReplacementBean() {
        if (replacementBean == null) {
            return "not autowired";
        }
        return replacementBean.toString();
    }

    @Override
    public String toString() {
        return "UseBeansFromAutoconfiguration{" +
               "beanOne is " + getBeanOne() +
               ", beanTwo is " + getBeanTwo() +
               ", beanFromNestedConfig is " + getBeanFromNestedConfig() +
               ", replacementBean is " + getReplacementBean() +
               '}';
    }
}
