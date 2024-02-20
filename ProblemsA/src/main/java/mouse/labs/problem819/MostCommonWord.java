package mouse.labs.problem819;

import java.util.HashMap;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String formattedParagraph = paragraph.toLowerCase();
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String s : banned) {
            String bannedWord = s.toLowerCase();
            wordCount.put(bannedWord, -1);
        }

        String[] words = formattedParagraph.replaceAll("[!?',;\\\\.]", " ")
                .replaceAll(" +", " ").trim().split(" ");
        for (String word : words) {
            Integer count = wordCount.get(word);
            if (count == null) {
                count = 0;
            }
            else if (count == -1) {
                continue;
            }
            wordCount.put(word, count+1);
        }
        int max = -1;
        String result = "";

        for (String key : wordCount.keySet()) {
            int count = wordCount.get(key);
            if (count > max) {
                max = count;
                result = key;
            }
        }

        return result;
    }
}
