package com.beemail;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Message {
    private String id = Utils.randomAlphaNum(128);
    private final LocalDate datetime = LocalDate.now();
    private final String content;
    private final User from;
    private final User to;
    private Boolean delivered = false;
    private Boolean read = false;

    public Message(String content, User from, User to) {
        this.content = content;
        this.from = from;
        this.to = to;
    }
    //private static Set<String> messageId = Set.of();

    // System.out.println("Enter your message");
    //        String id;
    //        Timestamp timestamp;
    //        do {
    //            id = randomAlphaNum(128);
    //        } while (messageId.contains(id));
    //        messageId.add(id);
    //        content = System.console().readLine();

    void log() {
        String message = String.format("%1s %2s \n%3s",from,datetime,content);
        System.out.println(message);
        markRead();
    }

    void markDelivered() {
        delivered = true;
    }

    Message markRead() {
        read = true;
        return this;
    }
}
