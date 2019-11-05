import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
* This is a program that reads a coded football ticket.
*
* Alexis Frison-1210-003
* 9/13/19
*/
public class TicketDecoder
{
   /**
   * @param args Command-line not used
   */
   
   public static void main(String[] args)
   {
   // Variables
      String gameName;
      String seat;
      String row;
      String section;
      String date;
      String dates1, dates2, dates3;
      String time;
      String timecolon, timecolon2;
      String discount;
      String price;
      double cost = 0;
      Scanner userInput = new Scanner(System.in);
      
   // Gets user input.
      System.out.print("Enter your ticket code: ");
      String ticketcode = userInput.nextLine();
      ticketcode.trim();
      if (ticketcode.length() < 26)
      {
         System.out.print("\nInvalid Ticket Code.");
         System.out.print("\nTicket code must have at least 26 characters.");
      }
      else
      {
         //Prints info.
         gameName = ticketcode.substring(25);
         System.out.print("\nGame:  " + gameName.trim());
         date = ticketcode.substring(11, 19);
         dates1 = date.substring(0, 2);
         dates2 = date.substring(2, 4);
         dates3 = date.substring(4);
         System.out.print("   Date: " + dates1 + "/" + dates2 + "/" + dates3);
         time = ticketcode.substring(7, 11);
         timecolon = time.substring(0, 2);
         timecolon2 = time.substring(2, 4);
         System.out.print("   Time: " + timecolon + ":" + timecolon2);
         section = ticketcode.substring(19, 21);
         System.out.print("\nSection: " + section);
         row = ticketcode.substring(21, 23);
         System.out.print("   Row: " + row);
         seat = ticketcode.substring(23, 25);
         System.out.print("   Seat: " + seat);
         
         //mOnEy
         DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
         price = ticketcode.substring(0, 5);
         double price2 = Double.parseDouble(price);
         price2 = price2 / 100;
         System.out.print("\nPrice: " + fmt1.format(price2));
         
         discount = ticketcode.substring(5, 6);
         DecimalFormat fmt2 = new DecimalFormat("0%");
         double discount2 = Double.parseDouble(discount);
         discount2 = discount2 / 10;
         System.out.print("   Discount: " + fmt2.format(discount2));
         
         cost = price2 - (discount2 * price2);
         System.out.print("   Cost: " + fmt1.format(cost));
         
         DecimalFormat fmt3 = new DecimalFormat("0000000"); 
         Random generator = new Random();
         int prize;
         prize = generator.nextInt(9999998) + 1;
         System.out.print("\nPrize Number: " + prize);  
      }
   }
}