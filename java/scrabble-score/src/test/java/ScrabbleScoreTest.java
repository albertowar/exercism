import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrabbleScoreTest {

    @Test
    public void testALowerCaseLetter() {
        assertEquals(1, Scrabble.getScore("a"));
    }

    @Test
    public void testAUpperCaseLetter() {
        assertEquals(1, Scrabble.getScore("A"));
    }

    @Test
    public void testIgnoresNonLetters() {
        assertEquals(1, Scrabble.getScore("A.!$%^&*()-=_+'#{}@~?>"));
    }

    @Test
    public void testAValuableLetter() {
        assertEquals(4, Scrabble.getScore("f"));
    }

    @Test
    public void testAShortWord() {
        assertEquals(2, Scrabble.getScore("at"));
    }

    @Test
    public void testAShortValuableWord() {
        assertEquals(12, Scrabble.getScore("zoo"));
    }

    @Test
    public void testAMediumWord() {
        assertEquals(6, Scrabble.getScore("street"));
    }

    @Test
    public void testAMediumValuableWord() {
        assertEquals(22, Scrabble.getScore("quirky"));
    }

    @Test
    public void testALongMixCaseWord() {
        assertEquals(41, Scrabble.getScore("OxyphenButazone"));
    }

    @Test
    public void testAEnglishLikeWord() {
        assertEquals(8, Scrabble.getScore("pinata"));
    }

    @Test
    public void testAnEmptyInput() {
        assertEquals(0, Scrabble.getScore(""));
    }

    @Test
    public void testEntireAlphabetAvailable() {
        assertEquals(87, Scrabble.getScore("abcdefghijklmnopqrstuvwxyz"));
    }

}
