package com.jeisson.springsecurityclient.infraestructure.entry_points.helper;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private UserModel user;
    private String appUrl;
    public RegistrationCompleteEvent(UserModel user, String appUrl) {
        super(user);
        this.user = user;
        this.appUrl = appUrl;
    }
}
