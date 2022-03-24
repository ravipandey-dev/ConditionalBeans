package com.config.test.config;

import com.config.test.service.Animal;
import com.config.test.service.Horse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnBean(Horse.class)
    public Animal animal(){

        return new Horse();

    }
}
