/** Alexis Frison-1210-003.
* 11/05/19 */

// This is the driver class for Wireless Networks

public class WirelessNetworksPart1
{
   /** @param args main is used. */
   public static void main(String[] args)
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      System.out.println(n1);
      
      Cellular n2 = new Cellular("\nMy Note", 5.0, 20.00, 1200, 1.0);
      System.out.println(n2);
      
      LTE n3 = new LTE("\nMy iPad", 20.0, 30.00, 1200, 2.0);
      System.out.println(n3);
      
      FiveG n4 = new FiveG("\nMy Phone", 80.0, 50.00, 1200, 10.0);
      System.out.println(n4);
   }
}