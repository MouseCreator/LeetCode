package mouse.labs.problem748;

import java.util.HashMap;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> targetMap = countChars(licensePlate);
        String result = null;
        for (String word : words) {
            if (!containsTarget(word, targetMap)) {
                continue;
            }
            if (result == null || result.length() > word.length()) {
                result = word;
            }
        }
        return result;
    }

    private boolean containsTarget(String word, HashMap<Character, Integer> targetMap) {
        HashMap<Character, Integer> wordMap = countChars(word);
        for (Character character : targetMap.keySet()) {
            Integer targetCount = targetMap.get(character);
            Integer actualCount = wordMap.get(character);
            if (actualCount == null || actualCount < targetCount) {
                return false;
            }
        }
        return true;
    }

    private HashMap<Character, Integer> countChars(String word) {
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                continue;
            }
            ch = Character.toLowerCase(ch);
            Integer count = resultMap.get(ch);
            if (count == null) {
                count = 0;
            }
            resultMap.put(ch, count + 1);
        }
        return resultMap;
    }
}
