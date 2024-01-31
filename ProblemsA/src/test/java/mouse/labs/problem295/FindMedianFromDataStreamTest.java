package mouse.labs.problem295;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {
    @Test
    void testSmall() {
        FindMedianFromDataStream findMedian = new FindMedianFromDataStream();
        findMedian.addNum(1);
        assertEquals(1, findMedian.findMedian());
        findMedian.addNum(2);
        assertEquals(1.5, findMedian.findMedian());
        findMedian.addNum(3);
        assertEquals(2, findMedian.findMedian());
    }

    @Test
    void testNegative() {
        FindMedianFromDataStream findMedian = new FindMedianFromDataStream();
        findMedian.addNum(-1);
        assertEquals(-1.0, findMedian.findMedian());
        findMedian.addNum(-2);
        assertEquals(-1.5, findMedian.findMedian());
        findMedian.addNum(-3);
        assertEquals(-2.0, findMedian.findMedian());
        findMedian.addNum(-4);
        assertEquals(-2.5, findMedian.findMedian());
        findMedian.addNum(-5);
        assertEquals(-3.0, findMedian.findMedian());
    }
    @Test
    void testLarge() {
        int[] nums = {40,12,16,14,35,19,34,35,28,35,26,6,8,2,14,25,25,4,33,18,10,14,27,3,35,13,24,27,14,5,0,38,19,25,11,14,31,30,11,31,0};
        double[] expectations = {40.00000,26.00000,16.00000,15.00000,16.00000,17.50000,19.00000,26.50000,28.00000,31.00000,28.00000,27.00000,
                26.00000,22.50000,19.00000,22.00000,25.00000,22.00000,25.00000,22.00000,19.00000,18.50000,19.00000,18.50000,19.00000,18.50000,
                19.00000,21.50000,19.00000,18.50000,18.00000,18.50000,19.00000,19.00000,19.00000,18.50000,19.00000,19.00000,19.00000,19.00000,
                19.00000};
        FindMedianFromDataStream findMedian = new FindMedianFromDataStream();
        int i = 0;
        List<Integer> inserted = new ArrayList<>();
        for (int n : nums) {
            findMedian.addNum(n);
            System.out.println("Adding " + n + "...");
            System.out.println(findMedian);
            double median = findMedian.findMedian();
            assertEquals(expectations[i], median, "No match for number " + i + " and " + findMedian + "\nInserted: " + inserted);
            inserted.add(n);
            i++;
        }
    }


}