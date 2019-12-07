import java.util.Comparator;
/** Alexis Frison-1210-003.
* 11/18/19 */

public class MonthlyCostComparator implements Comparator<WirelessNetwork>
{
   /** @param n1 is a WirelessNetwork.
      * @param n2 is a WireessNetwork.
      * @return 1, -1, 0 is an int. */
   public int compare(WirelessNetwork n1, WirelessNetwork n2)
   {
      if (n1.monthlyCost() < n2.monthlyCost())
      {
         return 1;
      }
      else if (n1.monthlyCost() > n2.monthlyCost())
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
}