package mouse.labs.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        Solution solution = new Solution();
        int[] s = solution.twoSum(new int[]{2,7,11,15}, 9);
        s = toSorted(s);
        assertArrayEquals(new int[] {0, 1}, s);
    }

    private int[] toSorted(int[] s) {
        return s[0] < s[1] ? s : new int[] {s[1], s[0]};
    }
}