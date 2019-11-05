/** Alexis Frison-1210-003.
 * 11/04/19 */
public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;
   
   /** @param nameIn is a String
     * @param priceIn is a double*/
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /** @param wordCountIn is an int */
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}