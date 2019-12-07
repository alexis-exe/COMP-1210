import java.util.ArrayList;	  	
 /**.	  	
 * Alexis Frison 1210-003	  	
 * 10/07/19  	
 */
 public class Temperatures	  	
 {
    private ArrayList<Integer> temperatures;	  	
    
    /**  	
    * @param temperaturesIn is an array list	
    */
    public Temperatures(ArrayList<Integer> temperaturesIn)	
    {
       temperatures = temperaturesIn; 	
    }	  	
  /** 	
    * @return low as an int 	
    */
    public int getLowTemp()	
    {
       if  (temperatures.isEmpty()) 	
       {
          return 0;
       }
       int low = temperatures.get(0);
       for (int i = 0; i < temperatures.size(); i++)
       {
          if (temperatures.get(i) < low)
          {
             low = temperatures.get(i);
          }
       }
       return low;
    }
    /** 	
    * @return high as an int	
    */
    public int getHighTemp()	
    {
       if (temperatures.isEmpty()) 	
       {
          return 0;
       }
       int high = temperatures.get(0);

       for (Integer temp : temperatures)	  	
       {
          if (temp > high)
          {
             high = temp;
          }
       }
       return high;
    }	  	
 
 /** 	
  * @param lowIn is an int 	
    * @return  lowIn < getLowTemp() ? lowIn : getLowTemp()
    */
    public int lowerMinimum(int lowIn)	
    {   
       return lowIn < getLowTemp() ? lowIn : getLowTemp();
    }	  	
 
 /** 	
  * @param highIn is an int 	
  * @return  highIn > getHighTemp() ? highIn : getHighTemp()  	
    */  	
    public int higherMaximum(int highIn)	  	
    {
       return highIn > getHighTemp() ? highIn : getHighTemp(); 	
    } 	
  /** 	
  * @return String returns string 	
  */
    public String toString()  	
    {
       return "\tTemperatures: " + temperatures 	
             + "\n\tLow: " + getLowTemp()
             + "\n\tHigh: " + getHighTemp();
    }
 }
