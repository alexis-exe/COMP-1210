import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/**.
*
* Alexis Frison-1210-003
* 10/29/19
*/
   
public class IceCreamConeList2
{
   // Instance Variables, Fields
   private String listName = "";
   private IceCreamCone[] coneList = new IceCreamCone[100];
   private int numberOfIceCreamCones;
   
   /**
   * @param listNameIn is a string
   * @param coneListIn is an Array List
   * @param numberOfCones is an int
   */
   // Constructor
   public IceCreamConeList2(String listNameIn,
                              IceCreamCone[] coneListIn, int numberOfCones)
   {
      listName = listNameIn;
      coneList = coneListIn;
      numberOfIceCreamCones = numberOfCones;
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
   * @return numberOfIceCreamCones as an int
   */
   public int numberOfIceCreamCones()
   {  
      return numberOfIceCreamCones;
   }
   
   /**.
   * @return double as a double
   */
   public double totalSurfaceArea()
   {
      double total = 0;
      int index = 0;
      
      if (coneList.length > 0)
      {   
         while (index < numberOfIceCreamCones)
         {
            total += coneList[index].surfaceArea();
            index++;
         }
         return total;
      }
      else
      {
         return 0;
      }
   }
   
   /**
   * @return total as a double for volume
   */
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      
      while (index < numberOfIceCreamCones)
      {
         total += coneList[index].volume();
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
      
      while (index < numberOfIceCreamCones)
      {
         total += (coneList[index].surfaceArea()) / numberOfIceCreamCones;
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
      
      while (index < numberOfIceCreamCones)
      {
         total += (coneList[index].volume()) / numberOfIceCreamCones;
         index++;
      }
      return total;
   }
   
   /**
   * @return a String
   */
   public String toString()
   {
      String finalString = listName + "\n";
      int index = 0;
      
      while (index < numberOfIceCreamCones)
      {
         finalString += coneList[index].toString() + "\n";
         index++;
      }
      return finalString + "\n";
   }
   
   /**
   * @return a String
   */
   public String summaryInfo()
   {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.000");
      
      return "----- Summary for " + listName + " -----\n"
         + "Number of IceCreamCone Objects: " + numberOfIceCreamCones + "\n"
         + "Total Surface Area: " + fmt1.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + fmt1.format(totalVolume()) + "\n"
         + "Average Surface Area: " + fmt1.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + fmt1.format(averageVolume()) + "\n\n";
   }
   
   /**
   * @return coneList is an ArrayList
   */
   public IceCreamCone[] getList()
   {
      return coneList;
   }
   
   /**
   * @param fileNameIn is a String
   * @throws FileNotFoundException for scanner
   * @return nameOfList, coneList2
   */
   public IceCreamConeList2 readFile(String fileNameIn) 
      throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      IceCreamCone[] coneList2 = new IceCreamCone[100];
      String nameOfList = scanFile.nextLine();
      int icecones = 0;
      while (scanFile.hasNext())
      {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone cone = new IceCreamCone(label, radius, height);
         coneList2[icecones] = cone;
         icecones++;
      }
      return new IceCreamConeList2(nameOfList, coneList2,
                                    icecones);
   }
   
   /**
   * @param label is a string
   * @param radius is a double
   * @param height is a double
   */
   public void addIceCreamCone(String label, double radius, double height)
   {
      IceCreamCone cone = new IceCreamCone(label, radius, height);
      coneList[numberOfIceCreamCones++] = cone;
   }
   
   /**
   * @param label is a string
   * @return cone returns a cone
   */
   public IceCreamCone findIceCreamCone(String label)
   {
      
      for (int i = 0; i < numberOfIceCreamCones; i++)
      {
         if (coneList[i].getLabel().equalsIgnoreCase(label))
         {
            return coneList[i];
         }
      }
      
      return null;
   }
   
   /**
   * @param label is a string
   * @return deletedCone as a String
   */
   public IceCreamCone deleteIceCreamCone(String label)
   {
      IceCreamCone deletedCone = null;
      deletedCone = findIceCreamCone(label);
      //label = label.toUpperCase();
      
      for (int i = 0; i < numberOfIceCreamCones; i++)
      {
         //String deleteLabel = ;
         
         if (coneList[i].getLabel().equalsIgnoreCase(label))
         {
            deletedCone = coneList[i];
            
            for (int j = i; j < numberOfIceCreamCones; j++)
            {
               coneList[j] = coneList[j + 1];
            }
            
            coneList [numberOfIceCreamCones - 1] = null;
            numberOfIceCreamCones--;
            return deletedCone;
         }
      }
      return null;  
   }
   
   /**
   * @param label is a String
   * @param radius is a double
   * @param height is a double
   * @return boolean true and false
   */
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
   
   /** @return 0 and shortest as doubles */
   public IceCreamCone findIceCreamConeWithShortestRadius()
   {
      if (numberOfIceCreamCones == 0)
      {
         return null;
      }
      
      // double shortest = coneList[0].getRadius();
      // int i = 0;
   //    
      // while (i < numberOfIceCreamCones)
      // {
         // if (!(shortest < coneList[i].getRadius()))
         // {
            // shortest = coneList[i].getRadius();
         // }
         // i++;
      // }
   //    
      // return coneList[i];
      
      double s = coneList[0].getRadius();
      int index = 0;
      for (int i = 0; i < numberOfIceCreamCones; i++) 
      {
         if (coneList[i].getRadius() < s) 
         {
            index = i;
            s = coneList[i].getRadius();
         }
      }
      return coneList[index];
   }
   
   /** @return 0 or longest as doubles */
   public IceCreamCone findIceCreamConeWithLongestRadius()
   {
      if (numberOfIceCreamCones == 0)
      {
         return null;
      }
      
      double l = coneList[0].getRadius();
      int index = 0;
      for (int i = 0; i < numberOfIceCreamCones; i++) 
      {
         if (coneList[i].getRadius() > l) 
         {
            index = i;
            l = coneList[i].getRadius();
         }
      }
      return coneList[index];
   }
   
   /** @return 0 and smallest as doubles */
   public IceCreamCone findIceCreamConeWithSmallestVolume()
   {
      if (numberOfIceCreamCones == 0)
      {
         return null;
      }
      
      double s = coneList[0].volume();
      int index = 0;
      for (int i = 0; i < numberOfIceCreamCones; i++) 
      {
         if (coneList[i].volume() < s) 
         {
            index = i;
            s = coneList[i].volume();
         }
      }
      return coneList[index];
   }
   
   /** @return 0 and largest as doubles */
   public IceCreamCone findIceCreamConeWithLargestVolume()
   {
      if (numberOfIceCreamCones == 0)
      {
         return null;
      }
      
      double l = coneList[0].volume();
      int index = 0;
      for (int i = 0; i < numberOfIceCreamCones; i++) 
      {
         if (coneList[i].volume() > l) 
         {
            index = i;
            l = coneList[i].volume();
         }
      }
      return coneList[index];
   }
}
