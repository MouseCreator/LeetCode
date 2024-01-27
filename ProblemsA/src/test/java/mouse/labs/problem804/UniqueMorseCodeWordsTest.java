package mouse.labs.problem804;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseCodeWordsTest {

    @Test
    void uniqueMorseRepresentations() {
        UniqueMorseCodeWords solution = new UniqueMorseCodeWords();
        assertEquals(2, solution.uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
    }
}