package dev.kuyReverseWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void test1_main() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.main("The quick brown fox jumps over the lazy dog."));
    }

    @Test
    void test2_main() {
        assertEquals("elppa", Kata.main("apple"));
    }

    @Test
    void test3_main() {
        assertEquals("a b c d", Kata.main("a b c d"));
    }

    @Test
    void test4_main() {
        assertEquals("elbuod decaps sdrow", Kata.main("double spaced words"));
    }

    @Test
    void test5_main() {
        assertEquals("elbuod  decaps  sdrow", Kata.main("double  spaced  words"));
    }

    @Test
    void test6_main() {
        assertEquals("", Kata.main(""));
    }
}