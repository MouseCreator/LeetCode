package mouse.labs.problem804;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    private final String[] lettersMorseCode = new String[] {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    };
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> unique = new HashSet<>();
        for (String word : words) {
            String morse = toMorseCode(word);
            unique.add(morse);
        }
        return unique.size();
    }

    private String toMorseCode(String word) {
        StringBuilder builder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            builder.append(lettersMorseCode[ch-'a']);
        }
        return builder.toString();
    }
}
