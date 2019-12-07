/** Alexis Frison-1210-003.
  * 11/22/19 */
public class InvalidCategoryException extends Exception
{
   /** @param categoryIn is a String. */
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }
}