package com.d9nich;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    private final ArrayList<String> list = new ArrayList<>();

    @BeforeAll
    static void setList() {
    }

    @Test
    public void testInsertion() {
        list.add("Beijing");
        assertEquals("Beijing", list.get(0));
        list.add("Shanghai");
        list.add("Hongkong");
        assertEquals("Hongkong", list.get(list.size() - 1));
    }

    @Test
    public void testDeletion() {
        list.clear();

        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        assertEquals(2, list.size());
    }
}