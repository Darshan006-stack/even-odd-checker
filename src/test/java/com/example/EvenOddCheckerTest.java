package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EvenOddCheckerTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOddChecker.isEven(10));
    }

    @Test
    void testOddNumber() { assertFalse(EvenOddChecker.isEven(7)); }

    @Test
    void testZeroIsEven() { assertTrue(EvenOddChecker.isEven(0)); }

    @Test
    void testNegativeEven() { assertTrue(EvenOddChecker.isEven(-4)); }

    @Test
    void testNegativeOdd() { assertFalse(EvenOddChecker.isEven(-3)); }
}