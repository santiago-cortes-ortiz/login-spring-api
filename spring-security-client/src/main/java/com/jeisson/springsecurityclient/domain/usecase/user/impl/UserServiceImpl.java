package com.jeisson.springsecurityclient.domain.usecase.user.impl;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.domain.model.user.gateway.UserRepository;
import com.jeisson.springsecurityclient.domain.usecase.user.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserModel register(UserModel userModel) {
        return userRepository.register(userModel);
    }
}
