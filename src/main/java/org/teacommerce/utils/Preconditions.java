package org.teacommerce.utils;

public class Preconditions {
    public static void require(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }
}
