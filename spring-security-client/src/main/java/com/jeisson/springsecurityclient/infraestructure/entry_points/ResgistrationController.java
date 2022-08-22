package com.jeisson.springsecurityclient.infraestructure.entry_points;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.domain.usecase.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ResgistrationController {
    private final UserService userService;
    @PostMapping("/register")
    public String register(@RequestBody UserModel userModel) {
        UserModel user = userService.register(userModel);
        return user.toString();
    }
}
