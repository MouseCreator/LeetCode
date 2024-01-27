package mouse.labs.problem599;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIndexSumTwoListsTest {

    @Test
    void findRestaurant() {
        MinimumIndexSumTwoLists solution = new MinimumIndexSumTwoLists();
        assertArrayEquals(arr("sad","happy"), solution.findRestaurant(arr("happy","sad","good"), arr("sad","happy","good")));
    }

    private String[] arr(String... s) {
        return s;
    }
}