package com.jeisson.springsecurityclient.application.config;

import com.jeisson.springsecurityclient.domain.model.user.gateway.UserRepository;
import com.jeisson.springsecurityclient.domain.usecase.user.UserService;
import com.jeisson.springsecurityclient.domain.usecase.user.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsesCaseConfig {
    @Bean
    public UserService UserService(UserRepository repository) {
        return new UserServiceImpl(repository);
    }
}
