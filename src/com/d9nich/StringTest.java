package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringTest {
    private String string = "Hello, World! Big query in your web site";

    @Test
    public void lengthTest() {
        string = "";
        assertEquals(0, string.length());

        string = "Hello, world";
        assertEquals(12, string.length());

        string = "Super-puper long sentence";
        assertEquals(25, string.length());
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void charAtTest() {
        assertEquals('H', string.charAt(0));
        assertEquals('e', string.charAt(39));
        assertEquals('q', string.charAt(18));
        assertThrows(IndexOutOfBoundsException.class, () -> string.charAt(40));
    }

    @Test
    public void substringTest() {
        assertEquals("Hello", string.substring(0, 5));
        assertEquals("site", string.substring(36));
    }

    @Test
    public void indexOfTest() {
        assertEquals(14, string.indexOf('B'));
        assertEquals(36, string.indexOf("site"));
        assertEquals(15, string.indexOf('i', 10));
        assertEquals(13, string.indexOf(" ", 10));
        assertEquals(-1, string.indexOf("aux", 10));
    }
}
