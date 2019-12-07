import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
  /** Alexis Frison-1210-003.
  * 11/22/19 */

public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** @Test tests the mainTest.
     * @throws FileNotFoundException is thrown bro.
     * @throws InvalidCategoryException is thrown. */
   @Test public void mainTest() throws FileNotFoundException,
                                 InvalidCategoryException
   {
      WirelessNetworksPart3 wnp3 = new WirelessNetworksPart3();
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      String[] args = new String[1];
      args[0] = "wireless_network_data2.exceptions.csv";
      WirelessNetworksPart3.main(args);
      
      String[] args2 = new String[0];
      WirelessNetworksPart3.main(args2);
      
      
      WirelessNetworkList wnList2 = new WirelessNetworkList();
      
      wnList.readFile("wireless_network_data2.exceptions.csv");
      
      Assert.assertEquals("mainTest", wnList.generateReport(),
                           wnList.generateReport());
   }

}
