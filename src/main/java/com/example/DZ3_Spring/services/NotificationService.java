package com.example.DZ3_Spring.services;

import com.example.DZ3_Spring.domain.User;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {

    public void notifyUser(User user) {

        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}