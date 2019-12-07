import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
  
/** Alexis Frison-1210-003.
* 11/18/19 */

public class WirelessNetworksPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** @Test tests the main driver. 
     * @throws FileNotFoundException is thrown bro. */
   @Test public void main() throws FileNotFoundException
   {
    
      WirelessNetworksPart2 wnp2 = new WirelessNetworksPart2();
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      String[] args = new String[1];
      args[0] = "wireless_network_data1.csv";
      
      WirelessNetworksPart2.main(args);
      String[] args2 = new String[0];
      WirelessNetworksPart2.main(args2);
      
      
      WirelessNetworkList wnList2 = new WirelessNetworkList();
      wnList.readFile("wireless_network_data1.csv");
      Assert.assertEquals("mainTest", wnList.generateReport(),
                           wnList.generateReport());
   }
}
