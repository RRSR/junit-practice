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
public class StringHelperParameterizedComparisionTest {

  private StringHelper stringHelper = new StringHelper();

  private String input;
  private String output;

  public StringHelperParameterizedComparisionTest(String input, String output) {
    this.input = input;
    this.output = output;
  }

  @Parameters
  public static Collection<String[]> testConditions() {
    String expectedInputOutput[][] = {
        {"ABCD", Boolean.FALSE.toString()},
        {"ABAB", Boolean.TRUE.toString()},
        {"AAA", Boolean.TRUE.toString()},
        {"ABC", Boolean.FALSE.toString()},
        {"AB", Boolean.TRUE.toString()},
        {"A", Boolean.FALSE.toString()}
    };
    return Arrays.asList(expectedInputOutput);
  }

  @Test
  public void test() {
    assertEquals(Boolean.parseBoolean(output),
        stringHelper.areFirstAndLastTwoCharactersTheSame(input));
  }
}
