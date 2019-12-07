/** Alexis Frison-1210-003.
* 11/05/19 */
public class InventoryListApp
{
   /** @param args is probably used */
   public static void main(String[] args)
   {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      // Adds items to InventoryItem[]
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      // Prints the goods
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}