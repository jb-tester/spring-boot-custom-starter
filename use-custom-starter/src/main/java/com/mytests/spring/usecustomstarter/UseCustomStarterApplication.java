package com.mytests.spring.usecustomstarter;

import com.mytests.spring.customSpringBootStarter.customAutoconfigurations.AutoconfigureCustom;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AutoconfigureCustom
public class UseCustomStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseCustomStarterApplication.class, args);
    }
    @Bean
        public CommandLineRunner commandLineRunner(ApplicationContext applicationContext, UseBeansFromAutoconfiguration useBeansFromAutoconfiguration, UseBeansFromCustomEnabler useBeansFromCustomEnabler) {
            return args -> {
                System.out.println("--------------------------------------");
                for (String name : applicationContext.getBeanDefinitionNames()) {
                    if (name.startsWith("my")) {System.out.println(name);}
                }
                System.out.println("--------------------------------------");
                System.out.println(useBeansFromAutoconfiguration.toString());
                System.out.println("--------------------------------------");
                System.out.println(useBeansFromCustomEnabler.toString());
                System.out.println("--------------------------------------");
            };
        }
}
