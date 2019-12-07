/** Alexis Frison-1210-003.
 * 11/04/19 */
public class ElectronicsItem extends InventoryItem
{
   protected double weight;
   /** why does this public variable need a Javadoc? */
   public static final double SHIPPING_COST = 1.5;
   
   /** @param nameIn is a String
     * @param priceIn is a double
     * @param weightIn is a double */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      //name = nameIn; // It doesn't need this code again bc
      //price = priceIn; // "super" calls the parent constructor
      weight = weightIn;
   }
   
   /** @return calculateCost() and SHIPPING_COST as a doubl */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}