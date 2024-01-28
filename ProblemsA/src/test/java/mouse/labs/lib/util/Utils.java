package mouse.labs.lib.util;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Utils {
    public static void validateEqualsAnyOrder(Object[] expected, Object[] actual) {
        if (expected == actual) {
            return;
        }
        if (expected.length != actual.length) {
            assertEquals(expected.length, actual.length, "Array lengths are not equal");
        }
        HashMap<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < expected.length; i++) {
            Integer integer = map.get(expected[i]);
            if (integer == null) {
                map.put(expected[i], 1);
            } else {
                map.put(expected[i], 3);
            }
            integer = map.get(actual[i]);
            if (integer == null) {
                map.put(expected[i], 2);
            } else {
                map.put(expected[i], 3);
            }
        }
        List<Object> l1Special = new ArrayList<>();
        List<Object> l2Special = new ArrayList<>();

        for (Object obj : map.keySet()) {
            Integer key = map.get(obj);
            if (key == 1) {
                l1Special.add(obj);
            } else if (key == 2) {
                l2Special.add(obj);
            }
        }
        String msg = "Arrays do not match. Expected: " + l1Special + ". Actual: " + l2Special;
        assertTrue(l1Special.isEmpty() && l2Special.isEmpty(), msg);
    }


}
