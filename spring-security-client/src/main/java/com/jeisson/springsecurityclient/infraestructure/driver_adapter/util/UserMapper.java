package com.jeisson.springsecurityclient.infraestructure.driver_adapter.util;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.infraestructure.driver_adapter.jpa_repository.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserMapper {

    public UserModel toModel(User user) {
        return UserModel.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public User toEntity(UserModel userModel) {
        return User.builder()
                .firstName(userModel.getFirstName())
                .lastName(userModel.getLastName())
                .email(userModel.getEmail())
                .password(userModel.getPassword())
                .role("USER")
                .build();
    }

}
