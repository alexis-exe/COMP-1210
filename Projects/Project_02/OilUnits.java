import java.util.Scanner;
/** This program will do something.
*
* Alexis Frison-1210-003
* 9/4/19
*/
public class OilUnits
{
  /**
  * 
  * @param args Commandline (not used).
  */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int ounces = 0;
      int quarts = 0;
      int gallons = 0;
      int barrels = 0;
      int ouncesOriginal = 0;
      
      //Does the thing.
      System.out.print("Enter amount of oil in ounces: ");
      ounces = userInput.nextInt();
      ouncesOriginal = ounces;
      if (ounces > 1000000000)
      {
         System.out.print("Amount must not exceed 1,000,000,000.");
      }
      //States conversions.
      else 
      {
         //Does the maths.
         gallons = ounces / 128;
         barrels = gallons / 42;
         gallons = (ounces / 128) % 42;
         quarts = (ounces % 128) / 32;
         ounces = (ounces % 128) % 32;
         //Prints the results.
         System.out.println("Oil amount in units: " + ounces);
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         //Prints the equation.
         System.out.print(ouncesOriginal + " oz = ("); 
         System.out.print(barrels + " bl * ");
         System.out.print("5376 oz) + (");
         System.out.print(gallons + " gal * 128 oz) + (");
         System.out.print(quarts + " qt * 32 oz) + (");
         System.out.print(ounces + " oz)");
      }
   }
}