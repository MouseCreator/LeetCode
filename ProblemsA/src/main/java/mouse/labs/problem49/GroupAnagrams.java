package mouse.labs.problem49;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> strings = map.computeIfAbsent(sorted, k -> new ArrayList<>());
            strings.add(s);
        }
        return new ArrayList<>(map.values());
    }



}
