/** Alexis Frison-1210-003.
* 11/11/19 */
public class ItemsList
{
   private InventoryItem[] inventory;
   private int count; // Counts number of items in inventory
   
   /** This does something I'm sure. */
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /** @param itemIn is an item of InventoryItem. */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn; // assigns InventoryItem
      count++;
   }
   
   /** @param electronicsSurcharge is a double
     * @return total as a double */
   public double calculateTotal(double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /** @return output as a String */
   public String toString()
   {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}