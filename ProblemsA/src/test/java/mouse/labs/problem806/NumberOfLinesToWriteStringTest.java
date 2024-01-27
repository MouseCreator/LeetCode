package mouse.labs.problem806;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLinesToWriteStringTest {

    @Test
    void numberOfLines() {
        int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        NumberOfLinesToWriteString solution = new NumberOfLinesToWriteString();
        assertArrayEquals(new int[]{3, 60}, solution.numberOfLines(width, s));
    }
}