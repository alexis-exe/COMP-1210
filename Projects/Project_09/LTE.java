/** Alexis Frison-1210-003.
* 11/05/19 */
public class LTE extends Cellular
{
   /** COST_FACTOR doesn't change. */
   public static final double COST_FACTOR = 4.0;
   
   /** @param nameIn is a String.
     * @param bandwidthIn is a double
     * @param mfcIn is a double
     * @param timeIn is a double
     * @param dataLimitIn is a double */
   public LTE(String nameIn, double bandwidthIn, double mfcIn,
               double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, mfcIn, timeIn, dataLimitIn);
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
         return (mfc + (dataUsage - dataLimit) * LTE.COST_FACTOR * 2);
      }
   }
}