package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringTest {
    private final String bigString = "Hello, World! Big query in your web site";

    @Test
    public void lengthTest() {
        String emptyString = "";
        assertEquals(0, emptyString.length());
        String mediumString = "Hello, world";
        assertEquals(12, mediumString.length());
    }

    @Test
    public void charAtTest() {
        assertEquals('H', bigString.charAt(0));
        assertEquals('q', bigString.charAt(18));
    }

    @Test
    public void substringTest() {
        assertEquals("Hello", bigString.substring(0, 5));
        assertEquals("site", bigString.substring(36));
    }

    @Test
    public void indexOfTest() {
        assertEquals(14, bigString.indexOf('B'));
        assertEquals(36, bigString.indexOf("site"));
        assertEquals(15, bigString.indexOf('i', 10));
        assertEquals(13, bigString.indexOf(" ", 10));
        assertEquals(-1, bigString.indexOf("aux", 10));
    }
}
