package com.sparta.dominic;

public class Raindrops {

    public String plingPlangPlong(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 3 == 0) {
            stringBuilder.append("Pling");
        }
        if (n % 5 == 0) {
            stringBuilder.append("Plang");
        }
    }
}
