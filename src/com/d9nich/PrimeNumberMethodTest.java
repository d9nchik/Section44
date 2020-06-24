package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberMethodTest {

    @Test
    void isPrime() {
        assertTrue(PrimeNumberMethod.isPrime(229));
        assertFalse(PrimeNumberMethod.isPrime(1001));//divided by 7
        assertFalse(PrimeNumberMethod.isPrime(-1));
    }
}