package mouse.labs.problem13;

import java.util.HashMap;

public class RomanToInteger {
    private static final HashMap<Character, Integer> letterValueMap = new HashMap<>();
    static {
        letterValueMap.put('M', 1000);
        letterValueMap.put('D', 500);
        letterValueMap.put('C', 100);
        letterValueMap.put('L', 50);
        letterValueMap.put('X', 10);
        letterValueMap.put('V', 5);
        letterValueMap.put('I', 1);
    }
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int lastValue = letterValueMap.get(chars[0]);
        for (int i = 1; i < chars.length; ++i) {
            int cost = letterValueMap.get(chars[i]);
            if (cost > lastValue) {
                result -= lastValue;
            } else {
                result += lastValue;
            }
            lastValue = cost;
        }
        result += lastValue;

        return result;
    }
}
