/** Alexis Frison-1210-003.
  * 10/25/19 */
public class Customer implements Comparable<Customer>
{
   private String name = "";
   private String location = "";
   private double balance = 0;
   
   /** @param nameIn is a String. */
   public Customer(String nameIn)
   {
      name = nameIn; // Sets name to paramater input
      location = ""; // Sets location to empty String
      balance = 0; // Sets balance to 0
   }
   
   /** @param locationIn is a String. */
   // Sets the "location" variable
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
 
   /** @param city is a String.
     * @param state is a String */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   
   /** @param amount is a double. */
   // Adds an amount to balance
   public void changeBalance(double amount)
   {
      balance += amount;
   }
   
   /** @return location as a String. */
   // Returns variable for location
   public String getLocation()
   {
      return location;
   }
   
   /** @return balace as a double. */
   // Returns variable for balance
   public double getBalance()
   {
      return balance;
   }
   
   /** @return name, location, and balance as a String. */
   // Shows everything
   public String toString()
   {
      return name + "\n" + location + "\n" + "$" + balance;
   }
   
   /** @param obj is an int.
     * @return 0 or -1 or 1 */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.00001)
      {
         return 0;
      }
      
      else if (this.balance < obj.getBalance())
      {
         return -1; // returns a negative number
      }
      
      else
      {
         return 1; // returns a positive number
      }
   }
}