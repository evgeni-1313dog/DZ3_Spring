package com.example.DZ3_Spring.services;

import com.example.DZ3_Spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public void processRegistration(String name, int age, String email){
        User user = userService.createUser(name, age, email);
        dataProcessingService.addUserToList(user);
    }

    //Поля UserService, NotificationService

    //Метод processRegistration
}