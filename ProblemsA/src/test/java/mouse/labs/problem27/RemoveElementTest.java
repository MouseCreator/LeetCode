package mouse.labs.problem27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void singleValue() {
        RemoveElement solution = new RemoveElement();
        int k = solution.removeElement(new int[]{1}, 1);
        assertEquals(0, k);
    }
}