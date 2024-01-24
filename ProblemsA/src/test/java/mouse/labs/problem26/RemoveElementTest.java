package mouse.labs.problem26;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    @Test
    void removeDuplicates() {
        int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
        int[] exp = new int[] {0,1,2,3,4};
        runAndCompare(arr, exp, 5);
    }

    @Test
    void removeDuplicatesSimple() {
        int[] arr = new int[] {1,1,2};
        int[] exp = new int[] {1,2};
        runAndCompare(arr, exp, 2);
    }

    private void runAndCompare(int[] arr, int[] exp, int expK) {
        int k = removeDuplicatesFromSortedArray.removeDuplicates(arr);
        assertEquals(k, expK);
        compareSubArrays(exp, arr, k);
    }

    private void compareSubArrays(int[] exp, int[] act, int k) {
        int[] subExp = new int[k];
        int[] subAct = new int[k];
        System.arraycopy(exp, 0, subExp, 0, k);
        System.arraycopy(act, 0, subAct, 0, k);
        assertArrayEquals(subExp, subAct, Arrays.toString(subExp) + " != " + Arrays.toString(subAct));
    }
}