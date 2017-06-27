import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnScoreForSingleLetterA_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnScoreForSingleLetterI_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("i"));
  }

  @Test
  public void calculateScore_returnScoreForSingleLetterTakenFromVowelList_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("e"));
  }

  @Test
  public void calculateScore_returnScoreForSingleLetterTakenFromConsonantList_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnScoreForTwoLetterWordBy_7() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 7;
    assertEquals(expected, testScrabble.calculateScore("by"));
  }

  @Test
  public void calculateScore_returnScoreForTwoLetterWordAs_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("as"));
  }

  @Test
  public void calculateScore_returnScoreForLongWord_13() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 13;
    assertEquals(expected, testScrabble.calculateScore("epicodus"));
  }

  @Test
  public void calculateScore_returnScoreForWordWithMixedCase_14() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 14;
    assertEquals(expected, testScrabble.calculateScore("Michael"));
  }

  @Test
  public void calculateScore_returnFalseForWordIncludingNonAlpha_Minus1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = -1;
    assertEquals(expected, testScrabble.calculateScore("ratty boo"));
  }

}
