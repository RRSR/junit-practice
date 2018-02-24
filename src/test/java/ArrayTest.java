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

  @Test(expected = NullPointerException.class)
  public void testArraySort_NullArray() {
    int[] numbers = null;
    int[] expected = {1, 7, 8, 12, 14};
    Arrays.sort(numbers);
    assertArrayEquals(expected, numbers);
  }

  @Test(timeout = 50)
  public void testArraySort_Performance(){
    int[] numbers = {1,4,3,2,6,8,2};
    for(int i =0 ; i<1000000; i++){
      numbers[1]=i;
      Arrays.sort(numbers);
    }
  }

}
