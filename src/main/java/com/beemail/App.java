package com.beemail;

import java.util.ArrayList;
import java.util.List;

import static com.beemail.User.*;

public class App {

    private static App instance;
    private List<User> users = new ArrayList<>();

    private App() {}

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    private void findUser(String userId) {

    }

    public void deliverMessage(String senderId, String recipientId, String content) {
        // CREATE A MESSAGE
        // FIND THE RECIPIENT
        // DELIVER THE MESSAGE
    }
}
