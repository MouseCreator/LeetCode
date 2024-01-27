package mouse.labs.problem599;

import java.util.*;


public class MinimumIndexSumTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = toHashMap(list1);
        int smallest = Integer.MAX_VALUE;
        List<String> results = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            String str = list2[i];
            Integer index1 = map1.get(str);
            if (index1 == null) {
                continue;
            }
            int sum = index1 + i;
            if (sum < smallest) {
                results = new ArrayList<>();
                smallest = sum;
                results.add(str);
            } else if (sum == smallest) {
                results.add(str);
            }
        }
        return results.toArray(new String[0]);
    }

    private HashMap<String, Integer> toHashMap(String[] list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], i);
        }
        return map;
    }
}
