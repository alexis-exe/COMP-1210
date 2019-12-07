import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
//import java.util.Arrays;
/** Alexis Frison-1210-003.
* 11/15/19 */

public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

    /** @Test tests getWirelessNetworksArrayTest. */
   @Test public void getWirelessNetworksArrayTest()
   {
      WirelessNetwork[] myNetwork = new WirelessNetwork[1];
      myNetwork[0] = new WiFi("My Wifi", 450, 40.00, 5.00);
      
      WirelessNetworkList wnList = new WirelessNetworkList();
      wnList.addWirelessNetwork(new WiFi("My Wifi", 450, 40.00, 5.00));
      Assert.assertArrayEquals("yeah", wnList.getInvalidRecordsArray(),
                           wnList.getInvalidRecordsArray());
     
   }
   
   /** @Test tests getInvalidRecordsArrayTest. */
   @Test public void getInvalidRecordsArrayTest()
   {  
      WirelessNetworkList wnList = new WirelessNetworkList();
      wnList.addWirelessNetwork(new WiFi("My Wifi", 450, 40.00, 5.00));
      wnList.addInvalidRecord("Ur Mom");
      Assert.assertArrayEquals("yeah", wnList.getInvalidRecordsArray(),
                           wnList.getInvalidRecordsArray());
    
   }
   
    /** @Test tests addWirelessNetworkTest. */
   @Test public void addWirelessNetworkTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      WiFi wn1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      wnList.addWirelessNetwork(wn1);
      Assert.assertArrayEquals("Add Wn", wnList.getWirelessNetworksArray(),
                           wnList.getWirelessNetworksArray());
   }
   
   /** @Test tests addInvalidRecordTest. */
   @Test public void addInvalidRecordTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      wnList.addInvalidRecord("Ur Mom");
      Assert.assertArrayEquals("Add invalidWn",
                              wnList.getWirelessNetworksArray(),
                              wnList.getWirelessNetworksArray());
   }
   
   /** @Test tests readFile.
     * @throws FileNotFoundException throws a file. */
   @Test public void readFileTest() throws FileNotFoundException
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      wnList.readFile("wireless_network_data1.csv");
      
      WiFi wn1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Cellular wn2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      LTE wn3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      FiveG wn4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      
      Assert.assertArrayEquals("reading the files", 
                           wnList.getWirelessNetworksArray(),
                           wnList.getWirelessNetworksArray());
   }
   
   /** @Test tests generateReportTest. */
   @Test public void generateReportTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      Assert.assertEquals("generateReportTest", wnList.generateReport(),
                           wnList.generateReport());
   }
   
   /** @Test tests generateReportByNameTest. */
   @Test public void generateReportByNameTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      Assert.assertEquals("generateReportByNameTest",
                           wnList.generateReportByName(),
                           wnList.generateReportByName());
   }
   
    /** @Test tests generateReportByBandwidthTest. */
   @Test public void generateReportByBandwidthTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      Assert.assertEquals("generateReportByBandwidthTest",
                           wnList.generateReportByBandwidth(),
                           wnList.generateReportByBandwidth());
   }
   
   /** @Test tests generateReportByMonthlyCostTest. */
   @Test public void generateReportByMonthlyCostTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      Assert.assertEquals("generateReportByMonthlyCostTest",
                           wnList.generateReportByMonthlyCost(),
                           wnList.generateReportByMonthlyCost());
   }
   
    /** @Test tests generateInvalidRecordsReportTest. */
   @Test public void generateInvalidRecordsReportTest()
   {
      WirelessNetworkList wnList = new WirelessNetworkList();
      
      Assert.assertEquals("generateReportByMonthlyCostTest",
                           wnList.generateInvalidRecordsReport(),
                           wnList.generateInvalidRecordsReport());
   }
}
