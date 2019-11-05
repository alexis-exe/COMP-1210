import java.text.DecimalFormat;
/**.
*
* Alexis Frison-1210-003
* 10/18/19
*/
public class IceCreamCone
{
/** @param args Command-line unused.
*
* This program will define objects.
*/
// Instance Variables
   private String label = " ";
   private double radius = 0;
   private double height = 0;

   /**
   * @param labelIn is the label
   * @param radiusIn is the radius
   * @param heightIn is the height
   */
   // Constructor
   public IceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
      if (labelIn == null) {
         labelIn = label;
      }
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   
   /**
   * @return label
   */
   // Methods
   public String getLabel()
   {
      return label;
   }
   
   /**
   * @param labelIn sets the label
   * @return false
   */
   public boolean setLabel(String labelIn)
   {
      if (labelIn == null)
      {
         return false;
      }
      
      else
      {
         label = labelIn.trim();
         return true;
      }
   }
      
   /**
   * @return radius
   */
   public double getRadius()
   {
      return radius;
   }
   
   /**
   * @param radiusIn sets the radius
   * @return false
   */
   public boolean setRadius(double radiusIn)
   {
      if (radiusIn > 0)
      {
         radius = radiusIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   * @return height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   * @param heightIn sets height
   * @return false
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn > 0)
      {
         height = heightIn;
         return true;
      }  
      else
      {
         return false;
      }
   }
   /**
    @return surfaceArea 
   */
   public double surfaceArea()
   {
      double coneSideArea = 0;
      coneSideArea = Math.PI * radius * Math.sqrt(Math.pow(height, 2) 
         + Math.pow(radius, 2));
     
      double hemisphereArea = 0; 
      hemisphereArea = 2 * Math.PI * Math.pow(radius, 2);
      
      double surfaceArea = 0;
      surfaceArea = coneSideArea + hemisphereArea;
      return surfaceArea;
   }
   
   /**
   * @return volume
   */
   public double volume()
   {
      double hemisphereVolume = 0;
      double coneVolume = 0;
      coneVolume = height * Math.PI * Math.pow(radius, 2) / 3;
      hemisphereVolume = 2 * Math.PI * Math.pow(radius, 3) / 3;
      
      double volume = 0;
      volume = coneVolume + hemisphereVolume;
      return volume;
   }
   
   /**
   * @return output 
   */
   public String toString()
   {  
      String output = " ";
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0######");
      // Maths
      output = "IceCreamCone \"" + getLabel() + "\" with radius = "
         + radius + " and height = "
         + height + " units has: \n\tsurface area = "
         + fmt1.format(surfaceArea()) + " square units \n\tvolume = "
         + fmt1.format(volume()) + " cubic units";
      return output;
   }
   
   /**
   * @param obj is an Object
   * @return label as a boolean
   */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof IceCreamCone))
      {
         return false;
      }
      
      else
      {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
   }
   
   // Returns 0 for no hashcode
   
   /**
   * @return 0 as an int
   */
   public int hashCode()
   {
      return 0;
   }
}