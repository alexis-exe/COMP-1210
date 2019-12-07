import java.io.FileNotFoundException;
/** Alexis Frison-1210-003.
  * 11/22/19 */
public class WirelessNetworksPart3
{
   /** @param args command line used. */
   public static void main(String[] args)
   {
      try
      {
         if (args.length <= 0)
         {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         }
         
         else
         {
            WirelessNetworkList networks = new WirelessNetworkList();
         
         // Reads the file, then uses the methods and prints
            networks.readFile(args[0]);
            System.out.print(networks.generateReport());
            System.out.print(networks.generateReportByName());
            System.out.print(networks.generateReportByBandwidth());
            System.out.print(networks.generateReportByMonthlyCost());
            System.out.print(networks.generateInvalidRecordsReport());      
         }
      
      }
      
      catch (FileNotFoundException e)
      {
         String fileName = args[0];
         
         System.out.print("*** Attempted to read file: " + fileName
                        + " (No such file or directory)");
      }
   }
}