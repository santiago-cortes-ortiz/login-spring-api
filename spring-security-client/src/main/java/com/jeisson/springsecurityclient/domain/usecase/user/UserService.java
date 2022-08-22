package com.jeisson.springsecurityclient.domain.usecase.user;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;

public interface UserService {
    UserModel register(UserModel userModel);
}
