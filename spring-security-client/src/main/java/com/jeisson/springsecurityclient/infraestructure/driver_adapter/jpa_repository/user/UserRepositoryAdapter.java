package com.jeisson.springsecurityclient.infraestructure.driver_adapter.jpa_repository.user;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.domain.model.user.gateway.UserRepository;
import com.jeisson.springsecurityclient.infraestructure.driver_adapter.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserRepositoryAdapter implements UserRepository {
    private final UserRepositoryJpa userRepositoryJpa;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    @Override
    public UserModel register(UserModel userModel) {
        userModel.setPassword(passwordEncoder.encode(userModel.getPassword()));
        User user = userRepositoryJpa.save(userMapper.toEntity(userModel));
        return userMapper.toModel(user);
    }
}
