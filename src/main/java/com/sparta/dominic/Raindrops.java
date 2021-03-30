package com.sparta.dominic;

public class Raindrops {

    private static final int PLING_VALUE = 3;
    private static final int PLANG_VALUE = 5;
    private static final int PLONG_VALUE = 7;

    public String plingPlangPlong(int n) {
        // String builder used to generate result.
        StringBuilder stringBuilder = new StringBuilder();
        // Check if the pling value factor is a factor of n
        if (isFactorOf(PLING_VALUE, n)) {
            stringBuilder.append("Pling");
        }
        // Check if plang value is a factor of n
        if (isFactorOf(PLANG_VALUE, n)) {
            stringBuilder.append("Plang");
        }
        // Check if plong value is a factor of n
        if (isFactorOf(PLONG_VALUE, n)) {
            stringBuilder.append("Plong");
        }
        // If empty none of 3, 5 and 7 are factors.
        if (stringBuilder.length() == 0) {
            stringBuilder.append(n);
        }
        return stringBuilder.toString();
    }

    private boolean isFactorOf(int f, int n) {
        return n % f == 0;
    }
}
