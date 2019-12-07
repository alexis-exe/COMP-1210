/** Alexis Frison-1210-003.
 * 11/04/19 */
public class OnlineBook extends OnlineTextItem
{
   protected String author;
   
   /** @param nameIn is a String
     * @param priceIn is a double*/
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /** @return name and author and price as a String */
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   }
   
   /** @param authorNameIn is a String */
   public void setAuthor(String authorNameIn)
   {
      author = authorNameIn;
   }
}