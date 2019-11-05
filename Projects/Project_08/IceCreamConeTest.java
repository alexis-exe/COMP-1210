import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**.
* Alexis Frison-1210-003
* 10/25/19
*/
public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      
   }
   
   /** Test for getLabel. */
   @Test public void getLabelTest()
   {  
      IceCreamCone cone2 = new IceCreamCone(null, 1, 2);
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      
      Assert.assertEquals("Ex 1", cone1.getLabel());
   }
   
   /** Test for setLabel. */
   @Test public void setLabelTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      // return true test
      Assert.assertTrue(cone1.setLabel("Ex 1")); 
      
      // return false test
      Assert.assertFalse(cone1.setLabel(null));
   }
   
   /** Test for getRadius. */
   @Test public void getRadiusTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      
      Assert.assertEquals(1, cone1.getRadius(), 0);
   }
   
   /** Test for setRadius. */
   @Test public void setRadiusTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      // return true test
      Assert.assertTrue(cone1.setRadius(1));
      
      //return false test
      Assert.assertFalse(cone1.setRadius(-.000001));
   }
   
   /** Test for getHeight. */
   @Test public void getHeightTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      Assert.assertEquals(2, cone1.getHeight(), 0);
   }
   
   /** Test for setHeight. */
   @Test public void setHeightTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      // return true test
      Assert.assertTrue(cone1.setHeight(1));
      
      //return false test
      Assert.assertFalse(cone1.setHeight(-.000001));
   }
   
   /** Test for surfaceArea. */
   @Test public void surfaceAreaTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      Assert.assertEquals(13.308000038220314, cone1.surfaceArea(), 0);
   }
   
   /** Test for volumeTest. */
   @Test public void volumeTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      Assert.assertEquals(4.1887902047863905, cone1.volume(), 0);
   }
   
   /** Test for toString. */
   @Test public void toStringTest()
   {
      
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      Assert.assertTrue(cone1.toString().contains(cone1.getLabel()));
   }
   
   
   
   /** Test for getCount and resetCount. */
   @Test public void getCountTest()
   {
      IceCreamCone.resetCount();
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      Assert.assertEquals(1.0, cone1.getCount(), 0);
   }
  
   /** Test for equals. */
   @Test public void equalsTest()
   {
      IceCreamCone cone1 = new IceCreamCone("Ex 1", 1, 2);
      IceCreamCone cone2 = new IceCreamCone("Ex 1", 1, 2);
      // returns true
      Assert.assertEquals("equals true test", true, cone1.equals(cone2));
      
      // returns false String
      cone2 = new IceCreamCone("", 1, 2);
      Assert.assertEquals("Equals false test", false, cone1.equals(cone2));
      // returns false Radius
      cone2 = new IceCreamCone("Ex 1", 2, 2);
      Assert.assertEquals("Equals false test", false, cone1.equals(cone2));
      // returns false Height
      cone2 = new IceCreamCone("Ex 1", 1, 3);
      Assert.assertEquals("Equals false test", false, cone1.equals(cone2));
      Assert.assertEquals("Equals false test", false, cone1.equals("Obj"));
      // tests hashCode
      Assert.assertEquals("equals false test", 0, cone1.hashCode());
   }
}