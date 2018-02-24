import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by Raj Rathore on 24-Feb-18
 */
public class ArrayTest {


  @Test
  public void testArraySort_RandomArray() {
    int[] numbers = {1, 14, 7, 12, 8};
    int[] expected = {1, 7, 8, 12, 14};
    Arrays.sort(numbers);
    assertArrayEquals(expected, numbers);
  }

}
