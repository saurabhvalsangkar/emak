package com.emak.configuration;

import com.emak.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.mock;

/**
 * @version 1.0
 * @author: GyanomTech Studios
 * @since 24/04/2013
 */
@Profile("dev")
@Configuration
public class ApplicationMockConfiguration {

    @Bean(name = "userRepository")
    public UserRepository userRepository() {
        return mock(UserRepository.class);
    } 
}