import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**.
*
* Alexis Frison-1210-003
* 10/08/19
*/


public class IceCreamConeList
{
   // Instance Variables, Fields
   private String listName = "";
   private ArrayList<IceCreamCone> coneList;
   
   /**
   * @param listNameIn is a string
   * @param coneListIn is an Array List
   */
   // Constructor
   public IceCreamConeList(String listNameIn,
                           ArrayList<IceCreamCone> coneListIn)
   {
      listName = listNameIn;
      coneList = coneListIn;
   }
   
   // Methods
   
   /**
   * @return listName as a String
   */
   public String getName()
   {
      return listName;
   }
   
   /**
   * @return coneList.size() as an int
   */
   public int numberOfIceCreamCones()
   {
      return coneList.size();
   }
   
   /**.
   * @return double as a double
   */
   public double totalSurfaceArea()
   {
      double total = 0;
      int index = 0;
      
      while (index < coneList.size())
      {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
   * @return total as a double for volume
   */
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      
      while (index < coneList.size())
      {
         total += coneList.get(index).volume();
         index++;
      }
      return total;
   }
   
   /**
   * @return total as a double for avg surface area
   */
   public double averageSurfaceArea()
   {
      double total = 0;
      int index = 0;
      
      while (index < coneList.size())
      {
         total += (coneList.get(index).surfaceArea()) / coneList.size();
         index++;
      }
      return total;
   }
   
   /**
   * @return total as a double for avg volume
   */
   public double averageVolume()
   {
      double total = 0;
      int index = 0;
      
      while (index < coneList.size())
      {
         total += (coneList.get(index).volume()) / coneList.size();
         index++;
      }
      return total;
   }
   
   /**
   * @return a String
   */
   public String toString()
   {
      String finalString = "";
      int index = 0;
      
      while (index < coneList.size())
      {
         finalString = "\n" + coneList.toString() + "\n";
         index++;
      }
      return "\n" + listName + "\n" + finalString;
   }
   
   /**
   * @return a String
   */
   public String summaryInfo()
   {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.000");
      
      return "----- Summary for " + listName + " -----\n"
         + "Number of IceCreamCone Objects: " + coneList.size() + "\n"
         + "Total Surface Area: " + fmt1.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + fmt1.format(totalVolume()) + "\n"
         + "Average Surface Area: " + fmt1.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + fmt1.format(averageVolume());
   }
   
   public ArrayList<IceCreamCone> getList()
   {
      return coneList;
   }
   
   // Project_06 //
   // This reads the file
   public IceCreamConeList readFile(String fileNameIn) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      ArrayList<IceCreamCone> coneList2 = new ArrayList<IceCreamCone>();
      String nameOfList = scanFile.nextLine();
      while (scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         double height = Double.parseDouble(scanFile.nextLine());
         double radius = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone cone = new IceCreamCone(label, radius, height);
         coneList2.add(cone);
      }
      return new IceCreamConeList(nameOfList, coneList);
   }
   
   public void addIceCreamCone(String label, double radius, double height)
   {
      IceCreamCone cone = new IceCreamCone(label, radius, height);
      coneList.add(cone);
   }
   
   public IceCreamCone findIceCreamCone(String label)
   {
      for (IceCreamCone cone : coneList)
      {
         if (cone.getLabel().equalsIgnoreCase(label))
         {
            return cone;
         }
      }
      
      return null;
   }
   
   public IceCreamCone deleteIceCreamCone(String label)
   {
      IceCreamCone deletedCone = null;
      deletedCone = findIceCreamCone(label);
      
      if (deletedCone != null)
      {
         int index = 0;
         index = coneList.indexOf(deletedCone);
         coneList.remove(index);
      }
      
      else
      {
         return null;
      }
      return deletedCone;
   }
   
   public boolean editIceCreamCone(String label, double radius, double height)
   {
      IceCreamCone editedCone = findIceCreamCone(label);
      
      if (editedCone != null)
      {
         editedCone.setRadius(radius);
         editedCone.setHeight(height);
         
         return true;
      }
      else
      {
         return false;
      }
   }
}