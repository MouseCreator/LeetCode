package mouse.labs.problem13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void romanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}