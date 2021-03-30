package com.sparta.dominic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaindropsTest {

    private Raindrops raindrops = new Raindrops();

    @Test
    void input3RetunrsPling() {
        String actual = raindrops.plingPlangPlong(3);
        String expected = "Pling";
        assertEquals(expected, actual);
    }

    @Test
    void input5ReturnsPlang() {
        String actual = raindrops.plingPlangPlong(5);
        String expected = "Plang";
        assertEquals(expected, actual);
    }

    @Test
    void input7ReturnsPlong() {
        String actual = raindrops.plingPlangPlong(7);
        String expected = "Plong";
        assertEquals(expected, actual);
    }

    @Test
    void input15ReturnsPlingPlang() {
        String actual = raindrops.plingPlangPlong(15);
        String expected = "PlingPlang";
        assertEquals(expected, actual);
    }

    @Test
    void input21ReturnsPlingPlong() {
        String actual = raindrops.plingPlangPlong(21);
        String expected = "PlingPlong";
        assertEquals(expected, actual);
    }

    @Test
    void input35ReturnsPlangPlong() {
        String actual = raindrops.plingPlangPlong(35);
        String expected = "PlangPlong";
        assertEquals(expected, actual);
    }

    @Test
    void input105ReturnsPlingPlangPlong() {
        String actual = raindrops.plingPlangPlong(105);
        String expected = "PlingPlangPlong";
        assertEquals(expected, actual);
    }
}
