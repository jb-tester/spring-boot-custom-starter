package com.mytests.spring.usecustomstarter;

import com.mytests.spring.customSpringBootStarter.beans.UnconditionalBeanForCustomAutoconfiguration;
import com.mytests.spring.customimportedspringbootstarter.LibBean;
import com.mytests.spring.customimportedspringbootstarter.OptionalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UseBeansFromCustomEnabler {

    // all those beans are available only if
    // the @AutoconfigureCustom annotation is present

    @Autowired(required = false) // present if property custom.props.prop1=foo
    private OptionalBean optionalBean;

    @Autowired(required = false) // present if property custom.props.prop2=bar
    private LibBean myLibBean;

    @Autowired(required = false) // present always if @AutoconfigureCustom is present
    private UnconditionalBeanForCustomAutoconfiguration myUnconditionalBeanForCustomAutoconfiguration;

    public String getOptionalBean() {
        if (optionalBean == null) {
            return "not autowired";
        }
        return optionalBean.toString();
    }

    public String getMyLibBean() {
        if (optionalBean == null) {
            return "not autowired";
        }
        return myLibBean.toString();
    }

    public String getMyUnconditionalBeanForCustomAutoconfiguration() {
        if (myUnconditionalBeanForCustomAutoconfiguration == null) {
            return "not autowired";
        }
        return myUnconditionalBeanForCustomAutoconfiguration.toString();
    }

    @Override
    public String toString() {
        return "UseBeansFromCustomEnabler{" +
               "myUnconditionalBeanForCustomAutoconfiguration is " + getMyUnconditionalBeanForCustomAutoconfiguration() +
               ", optionalBean is " + getOptionalBean() +
               ", myLibBean is " + getMyLibBean() +
               '}';
    }
}
