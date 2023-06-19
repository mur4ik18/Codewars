package dev.TakeATenMinutesWalk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeATenMinutesWalkTest {

    @Test
    void test1_main() {
        assertEquals(true, Kata.main(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }

    @Test
    void test2_main() {
        assertEquals(false, Kata.main(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    }

    @Test
    void test3_main() {
        assertEquals(false, Kata.main(new char[] {'w'}));
    }

    @Test
    void test4_main() {
        assertEquals(false, Kata.main(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}