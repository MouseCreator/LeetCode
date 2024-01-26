package mouse.labs.problem500;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            char[] chars = rows[i].toCharArray();
            for (char ch : chars) {
                map.put(ch, i);
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            String formattedWord = word.toLowerCase();
            if (isOneRow(map, formattedWord)) {
                result.add(word);
            }
        }
        String[] resultArr = new String[result.size()];
        result.toArray(resultArr);
        return resultArr;
    }

    private boolean isOneRow(HashMap<Character, Integer> map, String word) {
        int target = map.get(word.charAt(0));
        int length = word.length();
        for (int i = 1; i < length; i++) {
            if (map.get(word.charAt(i)) != target) {
                return false;
            }
        }
        return true;
    }
}
