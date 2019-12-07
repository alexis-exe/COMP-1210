import java.text.DecimalFormat;

/** Alexis Frison-1210-003.
* 11/05/19 */
public abstract class WirelessNetwork implements Comparable<WirelessNetwork>
{
   // Fields
   protected String name;
   protected double bandwidth;
   protected double mfc; // monthly fixed cost
   protected static int count = 0; // count for Wireless Network objects
   
   /** @param nameIn is a String.
     * @param bandwidthIn is a double
     * @param mfcIn is a double */
   public WirelessNetwork(String nameIn, double bandwidthIn, double mfcIn)
   {
      name = nameIn;
      bandwidth = bandwidthIn;
      mfc = mfcIn;
      
      count++;
   }
   
   /** @return name as a String. */
   public String getName()
   {
      return name;
   }
   
   /** @param nameIn is a String. */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
   /** @return bandwidth as a double. */
   public double getBandwidth()
   {
      return bandwidth; // In Mbps
   }
   
   /** @param bandwidthIn is a double. */
   public void setBandwidth(double bandwidthIn)
   {
      bandwidth = bandwidthIn;
   }
   
   /** @return mfc as a double. */
   public double getMonthlyFixedCost()
   {
      return mfc;
   }
   
   /** @param mfcIn is a double. */
   public void setMonthlyFixedCost(double mfcIn)
   {
      mfc = mfcIn;
   }
   
   /** @return count as an int. */
   public static int getCount()
   {
      return count;
   }
   
   /** void method to reset WirelessNetwork count. */
   public static void resetCount()
   {
      WirelessNetwork.count = 0;
   }
   
   /** @return name as a String. */
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      
      return name + " (" + this.getClass() + ") Cost: "
          + fmt.format(monthlyCost()) + "\nBandwidth: " + bandwidth + " Mbps";
   }
   
   /** @return double when not abstract. */
   public abstract double monthlyCost(); // Abstract methods do not use bodies
   // no test file for this
   
    /** @param other is a WirelessNetwork. 
      * @return name as an int after compared. */
   public int compareTo(WirelessNetwork other)
   {
      return name.toLowerCase().compareTo(other.getName().toLowerCase());
   }
}
