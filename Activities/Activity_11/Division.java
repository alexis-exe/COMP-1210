** Alexis Frison-1210-003.	  	
   * 11/18/19*/
   
 public class Division 	  	
 {	  	
    /** @param num is an int.	  	
      * @param denom is an int.	  	
      * @return num / denom or 0 as an int. */
  	
    public static int intDivide(int num, int denom)  	
    {	  	
       try  	
       {	  	
          return num / denom;  	
       }
       
       catch (ArithmeticException e)  	
       {  	
          return 0;  	
       }	  	
    }	  	
    
    /** @param num is an int.	  	
      * @param denom is an int.  	
      * @return num / denom as a double */
 	
    public static double decimalDivide(int num, int denom)  	
    {	  	
       if (denom == 0)  	
       {  	
          throw new IllegalArgumentException("The denominator "	
                     + "cannot be zero."); 	
       } 	
       return ((double) num / denom);	  	
    }  	
 }
