package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    void reverseNormalString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reverseSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }
}
