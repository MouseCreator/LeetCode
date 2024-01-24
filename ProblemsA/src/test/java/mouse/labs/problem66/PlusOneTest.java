package mouse.labs.problem66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne plusOne = new PlusOne();
        assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{1,0}, plusOne.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1,0,0,0}, plusOne.plusOne(new int[]{9,9,9}));
    }


}