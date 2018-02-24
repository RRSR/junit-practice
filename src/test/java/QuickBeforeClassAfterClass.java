import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Raj Rathore on 24-Feb-18
 */
public class QuickBeforeClassAfterClass {

  @BeforeClass
  public static void setup(){
    System.out.println("\nBefore Test Class setup getting ready!");
  }

  @Test
  public void test1() {
    System.out.println("Test 1 executed");
  }

  @Test
  public void test2() {
    System.out.println("Test 2 executed");
  }

  @AfterClass
  public static void teardown(){
    System.out.println("Tearing down the setup after the Test Class.");
  }

}