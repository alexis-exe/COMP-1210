/**.
*
* Alexis Frison-1210-003
* 10/18/19
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
   * @param customerNameIn is a String
   * @param interestRateIn is a double
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
   * @param amount is a double
   * @return wasLoanMade as boolean
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
   * @param amountPaid is a double
   * @return 0 returns zero
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * @return balance as double
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * @param interestRateIn is a double
   * @return true and false boolean
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * @return interestRate as double
   */
   public double getInterestRate() {
      return interestRate;
   }
   
 /**.
 * bruh nothing
 */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * @return output as String
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
   * @param amount is a double
   * @return amount as boolean
   */
   public static boolean isAmountValid(double amount)
   {
      return amount >= 0;
   }
   
 /**
   * @param loan is BankLoan
   * @return true as double
   */
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }
   
   private static int loansCreated = 0;
   
   /**
   * @return loansCreated as int
   */
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**.
   * nothigngng
   */
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
}
