import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Alexis Frison-1210-003.
  * 11/05/19 */
  
public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** @Test tests the monthlyCost method. */
   @Test public void monthlyCostTest()
   {
      // If dataUsage <= dataLimit, mfc   Not happening
      LTE n3False = new LTE("My iPad", 20.0, 30.00, 1200, 4.0);
      Assert.assertEquals(30.0, n3False.monthlyCost(), 0);
      
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      // else, Is happening
      Assert.assertEquals(38.0, n3.monthlyCost(), 0);
   }
}
