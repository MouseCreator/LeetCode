package mouse.labs.problem819;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {

    @Test
    void mostCommonWord() {
        MostCommonWord mostCommonWord = new MostCommonWord();
        String common = mostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"});
        assertEquals("ball", common);
    }
}