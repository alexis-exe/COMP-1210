import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**.
*
* Alexis Frison-1210-003
* 10/2/19
*/
public class IceCreamConeListApp
{
   /**
   * @param args CommandLine is totally not used I guess
   * @throws FileNotFoundException across the world
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<IceCreamCone> coneList = new ArrayList<IceCreamCone>();
      String listName = "";
      String label = "";
      double height = 0;
      double radius = 0;
      
      // Scans the user input's file
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {
         label = scanFile.nextLine();
         height = Double.parseDouble(scanFile.nextLine());
         radius = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone iccList = new IceCreamCone(label, height, radius);
         coneList.add(iccList);
      }
      
      // Prints I hope
      IceCreamConeList myList = new IceCreamConeList(listName, coneList);
      
   
      System.out.println(myList.toString().replace("[", "").replace("]", ""));
      System.out.println(myList.summaryInfo());
   }
}