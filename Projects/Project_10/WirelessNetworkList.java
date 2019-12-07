import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
/** Alexis Frison-1210-003.
* 11/15/19 */
public class WirelessNetworkList
{
   private WirelessNetwork[] wn; // The WirelessNetwork List
   private String[] invalidRec;
   
  /** whoooh Constructors are so cool. */  
   public WirelessNetworkList()
   {
   //You created two new arrays
   //reassign by declaring type-array with a size in brackets
      wn = new WirelessNetwork[0];
      invalidRec = new String[0];
   }
   
   /** @return wn as a WirelessNetwork array. */
   public WirelessNetwork[] getWirelessNetworksArray()
   {
      return wn;
   }
   
   /** @return invalidRec as an InvalidRecords array. */
   public String[] getInvalidRecordsArray()
   {
      return invalidRec;
   }
   
   /** @param wnNew is a WirelessNetwork. */
   public void addWirelessNetwork(WirelessNetwork...wnNew)
   {
      for (WirelessNetwork w : wnNew) { 
         wn = Arrays.copyOf(wn, wn.length + 1);
         wn[wn.length - 1] = w; 
      }
   }
   
   /** @param invalidRecNew is a String. */
   public void addInvalidRecord(String invalidRecNew)
   {
      invalidRec = Arrays.copyOf(invalidRec, invalidRec.length + 1);
      invalidRec[invalidRec.length - 1] = invalidRecNew; 
   }
   
   /** @param fileNameIn as a String.
     * @throws FileNotFoundException throws a file. */
   public void readFile(String fileNameIn) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      //char choice = 'X';
      
      while (scanFile.hasNextLine())
      {
         String input = scanFile.nextLine();
         Scanner scan = new Scanner(input);
         scan.useDelimiter(",");
         
      // Fun switch variables
         char category = scan.next().charAt(0);
         String name;
         double bandwidth;
         double mfc;
         double modemCost;
         double time;
         double dataLimit;
      
         switch(category)
         {
            case 'W': // Wifi
            
            // Scans each element separately
               name = scan.next();
               bandwidth = Double.parseDouble(scan.next());
               mfc = Double.parseDouble(scan.next());
               modemCost = Double.parseDouble(scan.next());
            
               WiFi n1 = new WiFi(name, bandwidth, mfc, modemCost);
               //System.out.println(n1);
               addWirelessNetwork(n1);
            
               break;
         
            case 'C': // Cellular
            
               name = scan.next();
               bandwidth = Double.parseDouble(scan.next());
               mfc = Double.parseDouble(scan.next());
               time = Double.parseDouble(scan.next());
               dataLimit = Double.parseDouble(scan.next());
            
            
               Cellular n2 = new Cellular(name, bandwidth, mfc, time,
                                          dataLimit);
            
               addWirelessNetwork(n2);
            
               break;
         
         
            case 'L': // LTE
            
               name = scan.next();
               bandwidth = Double.parseDouble(scan.next());
               mfc = Double.parseDouble(scan.next());
               time = Double.parseDouble(scan.next());
               dataLimit = Double.parseDouble(scan.next());
            
               LTE n3 = new LTE(name, bandwidth, mfc, time, dataLimit);
            
               addWirelessNetwork(n3);
            
               break;
         
            case 'F': // FiveG
            
               name = scan.next();
               bandwidth = Double.parseDouble(scan.next());
               mfc = Double.parseDouble(scan.next());
               time = Double.parseDouble(scan.next());
               dataLimit = Double.parseDouble(scan.next());
            
               FiveG n4 = new FiveG(name, bandwidth, mfc, time, dataLimit);
            
               addWirelessNetwork(n4);
            
               break;
         
            default:
            
               name = scan.next();
               addInvalidRecord(name);
               
               break;
         }
      }
   }
   
   /** @return output as a String. */
   public String generateReport()
   {
      String output = "-------------------------------"
                    + "\nMonthly Wireless Network Report"
                    + "\n-------------------------------\n";
      for (int i = 0; i < wn.length; i++)
      {
         output += wn[i].toString() + "\n\n";
      }
      
      return output;
   }
   
    /** @return output as a String. */
   public String generateReportByName()
   {
      String output = "-----------------------------------------"
                    + "\nMonthly Wireless Network Report (by Name)"
                    + "\n-----------------------------------------\n";
     
      // Makes a copy of the array list
      //WirelessNetwork[] wnCopy = Arrays.copyOf(wn, count);
      // Sorts that copy
      Arrays.sort(getWirelessNetworksArray());
   
      for (int i = 0; i < wn.length; i++)
      {
         output += wn[i].toString() + "\n\n";
      }
   
   
      return output;
   }
   
    /** @return output as a String. */
   public String generateReportByBandwidth()
   {
      String output = "----------------------------------------------"
                    + "\nMonthly Wireless Network Report (by Bandwidth)"
                    + "\n----------------------------------------------\n";
   
      // Makes a copy of the array list
      //WirelessNetwork[] wnCopy = Arrays.copyOf(wn, count);
      // Sorts that copy
      Arrays.sort(wn, new BandwidthComparator());
      
      for (int i = 0; i < wn.length; i++)
      {
         output += wn[i].toString() + "\n\n";
      }
      
      return output;
   }
   
    /** @return output ia a String. */
   public String generateReportByMonthlyCost()
   {
      String output = "-------------------------------------------------"
                    + "\nMonthly Wireless Network Report (by Monthly Cost)"
                    + "\n-------------------------------------------------\n";
     
      // Makes a copy of the array list
     //WirelessNetwork[] wnCopy = Arrays.copyOf(wn, count);
      // Sorts that copy
      Arrays.sort(wn, new MonthlyCostComparator());
      
      for (int i = 0; i < wn.length; i++)
      {
         output += wn[i].toString() + "\n\n";
      }
      
      return output;
   }
}