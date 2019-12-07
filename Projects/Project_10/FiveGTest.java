import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Alexis Frison-1210-003.
  * 11/05/19 */

public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** @Test tests the monthlyCost method. */
   @Test public void monthlyCostTest()
   {
      FiveG n4False = new FiveG("My Phone", 80.0, 50.00, 1200, 13.0);
      Assert.assertEquals(50.00, n4False.monthlyCost(), 0);
      
      FiveG n4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      Assert.assertEquals(80.00, n4.monthlyCost(), 0);
   }
}
