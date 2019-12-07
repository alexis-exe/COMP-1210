/** Alexis Frison-1210-003.
 * 11/04/19 */
public abstract class OnlineTextItem extends InventoryItem
{
   /** @param nameIn is a String
     * @param priceIn is a double*/
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   
   /** @return price as a double */
   public double calculateCost()
   {
      return price;
   }
}