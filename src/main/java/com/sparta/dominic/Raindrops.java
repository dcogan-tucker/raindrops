package com.sparta.dominic;

public class Raindrops {

    public String plingPlangPlong(int n) {
        // String builder used to generate result.
        StringBuilder stringBuilder = new StringBuilder();
        // Check if 3 is a factor of n
        if (isFactorOf(3, n)) {
            stringBuilder.append("Pling");
        }
        // Check if 5 is a factor of n
        if (isFactorOf(5, n)) {
            stringBuilder.append("Plang");
        }
        // Check if 7 is a factor of n
        if (isFactorOf(7, n)) {
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
