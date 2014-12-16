package com.emak.configuration;

import com.emak.jtex.mms.core.resource.MyDayResource;
import com.emak.jtex.mms.core.service.MyDayService;
import com.emak.jtex.mms.core.service.MyDayServiceImpl;
import com.emak.mail.MailSenderService;
import com.emak.user.*;
import com.emak.user.resource.MeResource;
import com.emak.user.resource.PasswordResource;
import com.emak.user.resource.UserResource;
import com.emak.user.resource.VerificationResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;

import javax.validation.Validator;

@Configuration
public class UserConfiguration {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @Autowired
    private MailSenderService mailSenderService;

    @Autowired
    private Validator validator;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DefaultTokenServices tokenServices;

    @Autowired
    private ClientDetailsService clientDetailsService;

    @Bean
    public VerificationTokenService verificationTokenService() {
        return new VerificationTokenServiceImpl(userRepository, verificationTokenRepository, mailSenderService, validator, passwordEncoder);
    }
    
    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository, validator, passwordEncoder);
    } 

    @Bean
    public MyDayService myDayService(){
        return new MyDayServiceImpl(validator);
    }
    @Bean
    public UserResource userResource() {
        return new UserResource(userService(), verificationTokenService(), tokenServices, passwordEncoder, clientDetailsService);
    }

    @Bean
    public PasswordResource passwordResource() {
        return new PasswordResource();
    }

    @Bean
    public VerificationResource verificationResource() {
        return new VerificationResource();
    }

    @Bean
    public MeResource meResource() {
        return new MeResource();
    }

    @Bean
    public MyDayResource myDayResource(){
        return new MyDayResource(myDayService());
    }
}
