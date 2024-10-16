package com.developergabs.gateway_pagamentos.util;

import java.security.SecureRandom;

public class RandomString {
    private static final String CHARACTERES = "ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvxyz0123456789";

    public static String generateRandomString(int lenght) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int index = secureRandom.nextInt(CHARACTERES.length());
            sb.append(CHARACTERES.charAt(index));
        }
        return sb.toString();
    }
}
