package com.beemail;

import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Message {
    private String id;
    private DateTimeFormatter datetime;
    private String content;
    private String from;
    private String to;
    private Boolean delivered;
    private Boolean read;
    //private static Set<String> messageId = Set.of();

    // System.out.println("Enter your message");
    //        String id;
    //        Timestamp timestamp;
    //        do {
    //            id = randomAlphaNum(128);
    //        } while (messageId.contains(id));
    //        messageId.add(id);
    //        content = System.console().readLine();

    private void log() {
        String message = String.format("%1s, %2s, %3s",datetime,from,content);
        System.out.println(message);
    }

    private void markDelivered() {
        delivered = true;
    }

    private void markRead() {
        read = true;
    }
}
