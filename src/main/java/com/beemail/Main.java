package com.beemail;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        App app = App.getInstance();

        User sender = new User("123", "PeterBrown");

        sender.addUser(app);

        sender.sendMessage("123", "Hello World!");

    }
}
