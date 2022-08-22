package com.jeisson.springsecurityclient.infraestructure.entry_points;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResgistrationController {
    @PostMapping("/register")
    public String register(@RequestBody UserModel userModel) {
        return "register";
    }
}
