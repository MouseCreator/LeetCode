package mouse.labs.problem139;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void wordBreak() {
        WordBreak wordBreak = new WordBreak();
        assertTrue(wordBreak.wordBreak("applepenapple", List.of("apple","pen")));
        assertFalse(wordBreak.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

    @Test
    void buildAutomata() {
        WordBreak wordBreak = new WordBreak();
        WordBreak.Automata automata = wordBreak.buildAutomata(List.of("he", "she", "his", "hers"));
        System.out.println(automata.print());
    }
}