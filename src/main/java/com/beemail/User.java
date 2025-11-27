package com.beemail;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static com.beemail.Utils.*;
import static com.beemail.Message.*;

public class User {
    private List inbox;
    private static Set<String> userIds = Set.of();
    private static Set<String> usernames = Set.of();
    private static Set<String[][]> userIdentifier = Set.of();
    static void addUser(App app) {
        String id;
        String username;
        do {
            id = randomAlphaNum(16);
            System.out.println("Enter your Username");
            username = System.console().readLine();
        } while (userIdentifier.contains(id));
        userIds.add(id);
        do {
            System.out.println("Enter your Username");
            username = System.console().readLine();
        } while (usernames.contains(username));
        usernames.add(username);

    }

    private void sendMessage(String recipientId, String content) {

    }

    private void receiveMessage (Message message) {
        inbox.add(message);
    }

    private void readMessage(int idx) {
        inbox.get(idx);
    }
}
