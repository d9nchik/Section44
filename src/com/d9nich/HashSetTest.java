package com.d9nich;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class HashSetTest {
    HashSet<Integer> hashSet = new HashSet<>();

    @Test
    public void addTest() {
        assertFalse(hashSet.contains(10));
        assertEquals(0, hashSet.size());
        hashSet.add(10);
        assertTrue(hashSet.contains(10));
        assertEquals(1, hashSet.size());
    }

    @Test
    public void removeTest() {
        hashSet.add(2);
        assertTrue(hashSet.contains(2));
        assertEquals(1, hashSet.size());
        hashSet.remove(2);
        assertFalse(hashSet.contains(2));
        assertEquals(0, hashSet.size());
    }

    @Test
    public void addAllTest() {
        assertEquals(0, hashSet.size());
        hashSet.addAll(Arrays.asList(1, 3, 5, 10, 2));
        assertEquals(5, hashSet.size());
        assertTrue(hashSet.contains(1) && hashSet.contains(2) && hashSet.contains(10) &&
                hashSet.contains(3) && hashSet.contains(5));
    }

    @Test
    public void removeAllTest() {
        hashSet.addAll(Arrays.asList(1, 3, 5, 10, 2));
        hashSet.removeAll(Arrays.asList(1, 3, 2, 7));
        assertTrue(hashSet.contains(10) && hashSet.contains(5));
        assertEquals(2, hashSet.size());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, hashSet.size());
        hashSet.addAll(Arrays.asList(1, 3, 5, 10, 2));
        assertEquals(5, hashSet.size());
    }

    @Test
    public void isEmptyTest(){
        assertTrue(hashSet.isEmpty());
        hashSet.add(7);
        assertFalse(hashSet.isEmpty());
    }

    @Test
    public void containsTest(){
        assertFalse(hashSet.contains(7));
        hashSet.add(7);
        assertTrue(hashSet.contains(7));
    }
}
