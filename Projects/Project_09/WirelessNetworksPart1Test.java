import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Alexis Frison-1210-003.
  * 11/05/19 */

public class WirelessNetworksPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** @Test tests the getCount and resetCount method. */
   @Test public void mainTest()
   {
      WirelessNetworksPart1 wn1 = new WirelessNetworksPart1();
      WirelessNetwork.resetCount();
      WirelessNetworksPart1.main(null);
      Assert.assertEquals("WirelessNetwork count should be 4. ", 4, 
                           WirelessNetwork.getCount());
   }
   
   
}
