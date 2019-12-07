import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
   /** Alexis Frison-1210-003.
* 11/05/19 */
public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   // Wireless Network methods
   
   /** @Test tests the getName method. */
   @Test public void getNameTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      
      Assert.assertEquals("My Wifi", n1.getName());
   }
   
   /** @Test tests the setName method. */
   @Test public void setNameTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals("", "My Wifi", n1.getName());
      n1.setName("Test");
   }
   
   /** @Test tests the getBandwidth method. */
   @Test public void getBandwidthTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(450.0, n1.getBandwidth(), 0);
   
   }
   
   /** @Test tests the setBandwidth method. */
   @Test public void setBandwidthTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(0, 450, n1.getBandwidth());
      n1.setBandwidth(450);
      //Assert.assertEquals(0, 450, n1.setBandwidth());
   }
   
   /** @Test tests the getMonthlyFixedCost method. */
   @Test public void getMonthlyFixedCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(40.00, n1.getMonthlyFixedCost(), 0);
   }
   
   /** @Test tests the setMonthlyFixedCost method. */
   @Test public void setMonthlyFixedCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(0, 40.00, n1.getMonthlyFixedCost());
      n1.setMonthlyFixedCost(40.00);
   }
   
   /** @Test tests the getCount method. */
   @Test public void getCountTest()
   {
      WirelessNetwork.resetCount();
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(1, n1.getCount(), 0);
   }
   
   // @Test resetCount is tested in getCountTest
   
   /** @Test tests the toString method. */
   @Test public void toStringTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals("My Wifi (class WiFi) Cost: $45.00"
                           + "\nBandwidth: 450.0 Mbps", n1.toString());
   }
   
   // WiFi method tests
   
   /** @Test tests the getModemCost method. */
   @Test public void getModemCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(5.00, n1.getModemCost(), 0);
   }
   
   /** @Test tests the setModemCost method. */
   @Test public void setModemCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(0, 5.00, n1.getModemCost());
      n1.setModemCost(5.00);
   }
   
   /** @Test tests the monthlyCost method. */
   @Test public void monthlyCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(45.00, n1.monthlyCost(), 0);
   }
}
