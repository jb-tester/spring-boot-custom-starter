package com.mytests.spring.usecustomstarter;

import com.mytests.spring.customSpringBootStarter.beans.UnconditionalBeanForCustomAutoconfiguration;
import com.mytests.spring.customimportedspringbootstarter.LibBean;
import com.mytests.spring.customimportedspringbootstarter.OptionalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class UseBeansFromCustomEnabler {

    // all those beans are available only if
    // the @AutoconfigureCustom annotation is present

    @Autowired // present if property custom.props.prop1=foo
    private Optional<OptionalBean> optionalBean;

    @Autowired // present if property custom.props.prop2=bar
    private Optional<LibBean> myLibBean;

    @Autowired // present always if @AutoconfigureCustom is present
    private Optional<UnconditionalBeanForCustomAutoconfiguration> myUnconditionalBeanForCustomAutoconfiguration;

    public String getOptionalBean() {
        return optionalBean.map(Object::toString).orElse("** not autowired **");
    }

    public String getMyLibBean() {
        return myLibBean.map(Object::toString).orElse("** not autowired **");
    }

    public String getMyUnconditionalBeanForCustomAutoconfiguration() {
        return myUnconditionalBeanForCustomAutoconfiguration.map(Object::toString).orElse("not autowired");
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
