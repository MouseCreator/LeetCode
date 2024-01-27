package mouse.labs.problem748;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestCompletingWordTest {

    @Test
    void shortestCompletingWord() {
        ShortestCompletingWord solution = new ShortestCompletingWord();
        String scw = solution.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"});
        assertEquals("steps", scw);
    }
    @Test
    void shortestCompletingWordIndiv() {
        ShortestCompletingWord solution = new ShortestCompletingWord();
        String scw = solution.shortestCompletingWord("AN87005", new String[]{
                "participant","individual","start","exist","above","already","easy","attack","player","important"});
        assertEquals("important", scw);
    }
}