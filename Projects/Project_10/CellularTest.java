import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Alexis Frison-1210-003.
  * 11/05/19 */

public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** @Test tests the getTime method. */
   @Test public void getTimeTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1200.0, n2.getTime(), 0);
   }
   
   /** @Test tests the setTime method. */
   @Test public void setTimeTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(0, 1200.0, n2.getTime());
      n2.setTime(1200.0);
   }
   
   /** @Test tests the getDataLimit method. */
   @Test public void getDataLimitTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1.0, n2.getDataLimit(), 0);
   }
   
   /** @Test tests the setDataLimit method. */
   @Test public void setDataLimitTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(0, 1.0, n2.getDataLimit());
      n2.setDataLimit(1.0);
   }
   
   /** @Test tests the dataUsage method. */
   @Test public void dataUsageTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(0.75, n2.dataUsage(), 0);
   }
   
   /** @Test tests the monthlyCost method. */
   @Test public void monthlyCostTest()
   {
      // If dataUsage <= dataLimit, mfc // This is happening
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(20.00, n2.monthlyCost(), 0);
      
      // else // Not happening
      Cellular n2False = new Cellular("My Note", 5.0, 20.00, 1200, 0.50);
      Assert.assertEquals(20.25, n2False.monthlyCost(), 0);  
   }
   
   /** @Test tests the toString method. */
   @Test public void toStringTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("My Note (class Cellular) Cost: $20.00"
                        + "\nBandwidth: 5.0 Mbps" 
                        + "\nTime: 1200.0 seconds"
                        + "\nData Limit: 1.0 GB"
                        + "\nData Used: 0.75 GB", n2.toString());
   }
}
