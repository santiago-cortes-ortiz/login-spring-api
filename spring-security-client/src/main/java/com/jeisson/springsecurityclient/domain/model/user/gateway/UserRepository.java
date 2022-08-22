package com.jeisson.springsecurityclient.domain.model.user.gateway;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;

public interface UserRepository {
    UserModel register(UserModel userModel);
}
