package com.beemail;

import java.util.Random;

public class Utils {

    static final Random random = new Random();

    static String randomAlphaNum(int n) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();
    }
}
