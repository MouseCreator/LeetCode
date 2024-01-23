package mouse.labs.twoSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        withExpected(new int[]{2,7,11,15}, 9, new int[] {0, 1});
        withExpected(new int[]{3, 2, 4}, 6, new int[] {1, 2});
        withExpected(new int[]{3, 3}, 6, new int[] {0, 1});
    }

    private void withExpected(int[] arr, int target, int[] expected) {
        Solution solution = new Solution();
        int[] s = solution.twoSum(arr, target);
        s = toSorted(s);
        String onFail = "Failed to compare " + Arrays.toString(expected) + " and " + Arrays.toString(s);
        assertArrayEquals(expected, s, onFail);
    }

    private int[] toSorted(int[] s) {
        return s[0] < s[1] ? s : new int[] {s[1], s[0]};
    }
}