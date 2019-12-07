/** Alexis Frison-1210-003.
* 11/05/19 */
public class Cellular extends WirelessNetwork
{
   protected double time;
   protected double dataLimit;
   /** COST_FACTOR never changes. */
   public static final double COST_FACTOR = 1.0;
   
   /** @param nameIn is a String.
     * @param bandwidthIn is a double
     * @param mfcIn is a double
     * @param timeIn is a double
     * @param dataLimitIn is a double */
   public Cellular(String nameIn, double bandwidthIn,
                     double mfcIn, double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, mfcIn);
      
      time = timeIn;
      dataLimit = dataLimitIn;
   }
   
    /** @return time as a double. */
   public double getTime()
   {
      return time;
   }
   
   /** @param timeIn as a double. */
   public void setTime(double timeIn)
   {
      time = timeIn;
   }
   
   /** @return dataLimit as a double. */
   public double getDataLimit()
   {
      return dataLimit; // in GB
   }
   
   /** @param dataLimitIn is a double. */
   public void setDataLimit(double dataLimitIn)
   {
      dataLimit = dataLimitIn;
   }
   
   /** @return dataUsage as a double. */
   public double dataUsage()
   {
      double dataUsage = bandwidth / 8000 * time;
      return dataUsage; // answer should be in GB
   }
   
   /** @return mfc as a double or total monthlyCost. */
   public double monthlyCost()
   {
      double dataUsage = bandwidth / 8000 * time;
      
      if (dataUsage <= dataLimit)
      {
         return mfc;
      }
      
      else
      {
         return (mfc + (dataUsage - dataLimit) * Cellular.COST_FACTOR);
      }
   }
   
   /** @return a String as a String. */
   public String toString()
   {
      double dataUsage = bandwidth / 8000 * time;
   
      return super.toString() + "\nTime: " + time + " seconds"
         + "\nData Limit: " + dataLimit + " GB" + "\nData Used: "
         + dataUsage + " GB";
   }
}