import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
  /** Alexis Frison-1210-003.
* 11/15/19 */

public class MonthlyCostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** @Test tests the compareTest. */
   @Test public void compareTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      WiFi wn1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Cellular wn2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      LTE wn3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      
      MonthlyCostComparator mcc = new MonthlyCostComparator();
      
      Assert.assertEquals("Hey this is an Error man", 0,
                          mcc.compare(wn1, wn1));
      Assert.assertEquals("Hey this is an Error man", 1, mcc.compare(wn2, wn3));
   }
}
