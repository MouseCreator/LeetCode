package mouse.labs.problem748;

public class ShortestCompletingWord {
    private final int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
    public String shortestCompletingWord(String licensePlate, String[] words) {
        long target = toPrimeProd(licensePlate);
        String result = null;
        for (String word : words) {
            long product = toPrimeProd(word);
            if (product % target != 0) {
                continue;
            }
            if (result == null || result.length() > word.length()) {
                result = word;
            }
        }
        return result;
    }

    private long toPrimeProd(String word) {
        long product = 1L;
        for (Character ch : word.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                int id = Character.toLowerCase(ch) - 'a';
                product *= primeNumbers[id];
            }
        }
        return product;
    }


}
