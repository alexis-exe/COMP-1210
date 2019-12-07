/** Alexis Frison-1210-003.
  * 11/04/19 */
  
public class InventoryItem
{
   protected String name;
   protected double price;
   private static double taxRate = 0;
     
      //Constructor
   /** @param nameIn is a String
     * @param priceIn is a double */
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
     
     // Hotgirl Methods
   /** @return name as a String */
   public String getName()
   {
      return name;
   }
     
   /** @return price and taxRate as a double */
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
     
   /** @param taxRateIn is a double */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
     
   /** @return nameand calculateCost() as a String */
   public String toString()
   {
      return name + ": $" + calculateCost();
   }
}