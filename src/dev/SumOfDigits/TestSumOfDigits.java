package dev.SumOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSumOfDigits {

    @Test
    void test1_main() {
        assertEquals(7, Kata.main(16));
    }

    @Test
    void test2_main() {
        assertEquals(6, Kata.main(456));
    }
}