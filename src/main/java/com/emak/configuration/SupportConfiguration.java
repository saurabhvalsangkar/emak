package com.emak.configuration;

import com.emak.resource.GenericExceptionMapper;
import com.emak.resource.HealthCheckResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.validation.Validation;
import javax.validation.Validator;

@Configuration
public class SupportConfiguration {

    @Bean
    public Validator validator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Bean
    @Scope(value = "singleton")
    public GenericExceptionMapper genericExceptionMapper() {
        return new GenericExceptionMapper();
    }

    @Bean
    public HealthCheckResource healthCheckResource() {
        return new HealthCheckResource();
    }

}
