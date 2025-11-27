package com.beemail;

import static com.beemail.User.*;

public class App {

    private static App app;

    private App() {}

    public static App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }
    private void addUser(User user) {

    }

    private void findUser(String userId) {

    }

    private void deliverMessage(String senderId, String recipientId, String content) {

    }
}
