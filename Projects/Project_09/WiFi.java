/** Alexis Frison-1210-003.
* 11/05/19 */
public class WiFi extends WirelessNetwork
{
   private double modemCost;
   
   /** @param nameIn is a String.
     * @param bandwidthIn is a double
     * @param mfcIn is a double
     * @param modemCostIn is a double */
   public WiFi(String nameIn, double bandwidthIn, double mfcIn,
               double modemCostIn)
   {
      super(nameIn, bandwidthIn, mfcIn);
      
      modemCost = modemCostIn;
   }
   
   /** @return modemCost as a double. */
   public double getModemCost()
   {
      return modemCost;
   }
   
   /** @param modemCostIn is a double. */
   public void setModemCost(double modemCostIn)
   {
      modemCost = modemCostIn;
   }
   
   /** @return total monthlyCost as a double. */
   public double monthlyCost()
   {
      return mfc + modemCost;
   }
}