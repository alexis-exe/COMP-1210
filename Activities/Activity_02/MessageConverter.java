import java.util.Scanner;
/** This program gon do somethin.
*
* Alexis Frison-1210-003
* 9/9/19
*/
public class MessageConverter
{
   /**
   * @param args Commandline (not used).
   */
   public static void main(String[] args)
   {
      //Declares variables.
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
      
      //Requests input.
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      //Shows output types.
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0)
      { // As is
         result = message;
      }
      else if (outputType == 1)
      { // Trimmed
         result = message.trim();
      }
      
      else if (outputType == 2)
      { // Lower case
         result = message.toLowerCase();
      }
      
      else if (outputType == 3)
      { // Upper case
         result = message.toUpperCase();
      }
      
      else if (outputType == 4)
      { // Replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      
      else if (outputType == 5)
      { // Without first and last character
         result = message.substring(1, message.length() - 1);
      }
      
      else
      { // Invalid input
         result = "Error: Invalid choice input.";
      }
     // Prints result
      System.out.println("\n" + result);
   }
}