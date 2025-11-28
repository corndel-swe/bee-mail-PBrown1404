package com.beemail;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static com.beemail.Utils.*;
import static com.beemail.Message.*;

public class User {
    private final String id;
    private final String username;
    private final List<Message> inbox = new ArrayList<>();

//    private static Set<String> userIds = Set.of();
//    private static Set<String> usernames = Set.of();
//    private static Set<String[][]> userIdentifier = Set.of();

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    static void addUser(App app) {
//        do {
//            id = randomAlphaNum(16);
//            System.out.println("Enter your Username");
//            username = System.console().readLine();
//        } while (userIdentifier.contains(id));
//        userIds.add(id);
//        do {
//            System.out.println("Enter your Username");
//            username = System.console().readLine();
//        } while (usernames.contains(username));
//        usernames.add(username);
    }

    private void sendMessage(String recipientId, String content) {

    }

    private void receiveMessage (Message message) {
        inbox.add(message);
        message.markDelivered();
    }

    private void readMessage(int idx) {
        inbox.get(idx).markRead().log();
    }
}
