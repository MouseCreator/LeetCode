package mouse.labs.problem35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void searchInsert() {
        SearchInsert solution = new SearchInsert();
        assertEquals(2, solution.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, solution.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, solution.searchInsert(new int[]{1,3,5,6}, 7));
    }
}