package com.jeisson.springsecurityclient.infraestructure.entry_points.helper.listener;

import com.jeisson.springsecurityclient.domain.model.user.UserModel;
import com.jeisson.springsecurityclient.infraestructure.entry_points.helper.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //create the verification token for the user
        UserModel user = event.getUser();
        String token = UUID.randomUUID().toString();
        //send email to user
    }
}
