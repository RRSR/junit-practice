import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by Raj Rathore on 24-Feb-18
 */
@RunWith(Parameterized.class)
public class StringHelperParameterizedTruncateTest {

  private StringHelper stringHelper = new StringHelper();

  private String input;
  private String output;

  public StringHelperParameterizedTruncateTest(String input, String output) {
    this.input = input;
    this.output = output;
  }

  @Parameters
  public static Collection<String[]> testConditions() {
    String expectedInputOutput[][] = {
        {"AACD", "CD"},
        {"ACD", "CD"},
        {"EFCD", "EFCD"},
        {"A", ""}
    };
    return Arrays.asList(expectedInputOutput);
  }

  @Test
  public void truncateAInFirst2Positions_TwoAinFirst2Position() {
    assertEquals(output, stringHelper.truncateAInFirst2Positions(input));
  }

}