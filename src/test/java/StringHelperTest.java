import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by Raj Rathore on 24-Feb-18
 */
public class StringHelperTest {

  private StringHelper stringHelper = new StringHelper();

  // AACD -> CD
  @Test
  public void truncateAInFirst2Positions_TwoAinFirst2Position() {
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
  }

  // ACD -> CD
  @Test
  public void truncateAInFirst2Positions_OneAinFirst2Positions() {
    assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
  }

  // EFCD -> CD
  @Test
  public void truncateAInFirst2Positions_NoAinFirst2Positions() {
    assertEquals("EFCD",stringHelper.truncateAInFirst2Positions("EFCD"));
  }

  // A ->
  @Test
  public void truncateAInFirst2Positions_OneAinFirst1Positions() {
    assertEquals("",stringHelper.truncateAInFirst2Positions("A"));
  }

  //ABCD -> false
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
    assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
  }

  //ABAB -> true
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
    assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
  }

  //AAA -> true
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenarioThreeLetter() {
    assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AAA"));
  }

  //ABC -> false
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenarioThreeLetter() {
    assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABC"));
  }

  //AB -> true
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenarioTwoLetter() {
    assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
  }

  //A -> false
  @Test
  public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenarioOneLetter() {
    assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
  }
}