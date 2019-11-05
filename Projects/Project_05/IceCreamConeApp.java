import java.util.Scanner;
/**.
*
* Alexis Frison-1210-003
* 10/2/19
*/
public class IceCreamConeApp
{
 /**
 * This gets the stuff from the other thing.
 * @param args CommandLine probably used but idk
 */
   public static void main(String[] args)
   {  
      // Variables again
      String label = " ";
      double radius = 0;
      double height = 0;
      
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, radius, and height for an" 
         + " ice cream cone.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tradius: ");
      radius = userInput.nextDouble();
      
      if (radius <= 0)
      {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      
      System.out.print("\theight: ");
      height = userInput.nextDouble();
      
      if (height <= 0)
      {
         System.out.print("Error: height must be greater than 0.");
      }
      
      else
      {
         IceCreamCone icc = new IceCreamCone(label, radius, height);
         System.out.print("\n" + icc);
      }
   }
}
