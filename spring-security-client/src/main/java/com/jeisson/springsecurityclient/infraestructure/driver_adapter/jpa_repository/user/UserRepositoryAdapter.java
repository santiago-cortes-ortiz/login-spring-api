package com.jeisson.springsecurityclient.infraestructure.driver_adapter.jpa_repository.user;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.domain.model.user.gateway.UserRepository;
import com.jeisson.springsecurityclient.infraestructure.driver_adapter.util.UserMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepository {
    private final UserRepositoryJpa userRepositoryJpa;
    private final UserMapper userMapper;
    @Override
    public UserModel register(UserModel userModel) {
        User user = userRepositoryJpa.save(userMapper.toEntity(userModel));
        return userMapper.toModel(user);
    }
}
