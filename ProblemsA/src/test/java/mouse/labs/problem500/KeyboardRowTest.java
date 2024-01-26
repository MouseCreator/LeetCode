package mouse.labs.problem500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {

    @Test
    void findWords() {
        KeyboardRow keyboardRow = new KeyboardRow();
        String[] words = keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertArrayEquals(new String[]{"Alaska", "Dad"}, words);
    }
}