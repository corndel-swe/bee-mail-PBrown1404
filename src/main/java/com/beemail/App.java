package com.beemail;

import static com.beemail.User.*;

public class App {

    private static App instance;

    private App() {}

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }
    private void addUser(User user) {

    }

    private void findUser(String userId) {

    }

    private void deliverMessage(String senderId, String recipientId, String content) {

    }
}
