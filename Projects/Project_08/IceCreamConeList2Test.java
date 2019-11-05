import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** Alexis Frison-1210-003.
  * 10/29/19 */

public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

 
   /** Tests for getNameTest. 
    * @throws FileNotFoundException yeah.*/
   @Test public void getNameTest()
      throws FileNotFoundException
   {  
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals("IceCreamCone Test List", coneList.getName());
   }
   
   /** Tests for numberOfIceCreamConesTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void numberOfIceCreamConesTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(3, coneList.numberOfIceCreamCones());
      
      // Tests for 0 cones
      coneList = coneList.readFile("IceCreamCone_data_0.txt");
      
      Assert.assertEquals(0, coneList.numberOfIceCreamCones());
   }
   
   /** Tests for totalSurfaceAreaTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void totalSurfaceAreaTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(449905.09745852894,
                           coneList.totalSurfaceArea(), .000001);
      
      // Tests for 0 cones
      IceCreamCone[] list2 = new IceCreamCone[0];
      IceCreamConeList2 coneList2 = new IceCreamConeList2("", list2, 0);
      
      coneList = coneList.readFile("IceCreamCone_data_0.txt");
      
      Assert.assertEquals(0, coneList2.totalSurfaceArea(), .000001);
   }
   
   /** Tests for totalVolumeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void totalVolumeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(18295116.588485, coneList.totalVolume(), .000001);
      
      coneList = coneList.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(0, coneList.totalVolume(), .000001);
   }
   
   /** Tests for averageSurfaceAreaTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void averageSurfaceAreaTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(149968.365819,
                           coneList.averageSurfaceArea(), .000001);
      
      coneList = coneList.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(0, coneList.averageSurfaceArea(), .000001);
   }
   
   /** Tests for averageVolumeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void averageVolumeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(6098372.1961618345,
                           coneList.averageVolume(), .000001);
      
      coneList = coneList.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(0, coneList.averageVolume(), .000001);
   }
   
   /** Tests for toStringTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void toStringTest()
   {
      IceCreamCone[] list = new IceCreamCone[100];
      list[0] = new IceCreamCone("Ex 1", 5, 10);
      list[1] = new IceCreamCone("Ex 2", 10, 5);
      
      IceCreamConeList2 elboow = new IceCreamConeList2("help", list, 2);
      
      Assert.assertEquals("toString Test", true,
                           elboow.toString().contains(elboow.getName()));
   }
   
   /** Tests for summaryInfoTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void summaryInfoTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(true, coneList.summaryInfo()
                           .contains("Number of IceCreamCone Objects: 3"));
   }
   
   /** Tests for getListTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void getListTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      //Arrays need this stuff
      list[0] = new IceCreamCone("Ex 1", 1, 2);
      list[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      list[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      Assert.assertArrayEquals(list, coneList.getList());
   }
   
   /** Tests for readFileTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void readFileTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", null, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals("IceCreamCone Test List", coneList.getName());
   }
   
   /** Tests for addIceCreamConeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void addIceCreamConeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      IceCreamCone cone1 = new IceCreamCone("Ex 4", 4, 5);
      coneList.addIceCreamCone("Ex 4", 4, 5);
      IceCreamCone[] cA = coneList.getList();
      
      Assert.assertEquals("addIceCreamCone Test", cone1, cA[3]);
   }
   
   /** Tests for findIceCreamConeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void findIceCreamConeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals(null, coneList.findIceCreamCone(""));
   }
   
   /** Tests for deleteIceCreamConeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void deleteIceCreamConeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      //Arrays need this stuff
      list[0] = new IceCreamCone("Ex 1", 1, 2);
      list[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      list[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      Assert.assertEquals("deletIceCreamCone true Test", list[1],
                           coneList.deleteIceCreamCone("Ex 2"));
      Assert.assertEquals("deletIceCreamCone false Test", null,
                           coneList.deleteIceCreamCone("Ex 5"));
   }
   
   /** Tests for editIceCreamConeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void editIceCreamConeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      list[0] = new IceCreamCone("Ex 1", 5, 10);
      list[1] = new IceCreamCone("Ex 2", 10, 5);
      list[2] = new IceCreamCone("Ex 3", 1, 1);
      list[3] = new IceCreamCone("Ex 4", 20, 20);
      
      IceCreamConeList2 coneList = new IceCreamConeList2("help", list, 4);
      
      Assert.assertTrue(coneList.editIceCreamCone("Ex 1", 10, 20));
      Assert.assertFalse(coneList.editIceCreamCone(null, 420, 420));
   }
   
   /** Tests for findIceCreamConeWithShortestRadiusTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void findIceCreamConeWithShortestRadiusTest()
   {
      IceCreamCone[] list = new IceCreamCone[100];
      list[0] = new IceCreamCone("Ex 1", 5, 10);
      list[1] = new IceCreamCone("Ex 2", 10, 5);
      list[2] = new IceCreamCone("Ex 3", 1, 1);
      list[3] = new IceCreamCone("Ex 4", 20, 20);
      
      IceCreamConeList2 elboow = new IceCreamConeList2("help", list, 4);
      Assert.assertEquals(list[2], elboow.findIceCreamConeWithShortestRadius());
      
      IceCreamConeList2 elbow = new IceCreamConeList2("help", null, 0);
      Assert.assertEquals(null, elbow.findIceCreamConeWithShortestRadius());
   }
   
   /** Tests for findIceCreamConeWithLongestRadiusTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void findIceCreamConeWithLongestRadiusTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 56);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      IceCreamCone j = new IceCreamCone("Ex 3", 123.4, 900);
      Assert.assertEquals(j, coneList
                           .findIceCreamConeWithLongestRadius());
      
      IceCreamConeList2 coneList2 = new IceCreamConeList2("", null, 0);
      coneList = coneList.readFile("IceCreamCone_data_0.txt"); 
      
      Assert.assertEquals(null, coneList
                           .findIceCreamConeWithLongestRadius());
   }
   
   /** Tests for findIceCreamConeWithSmallestVolumeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void findIceCreamConeWithSmallestVolumeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      list[0] = new IceCreamCone("Ex 1", 5, 10);
      list[1] = new IceCreamCone("Ex 2", 10, 5);
      list[2] = new IceCreamCone("Ex 3", 1, 1);
      list[3] = new IceCreamCone("Ex 4", 20, 20);
      
      IceCreamConeList2 elboow = new IceCreamConeList2("help", list, 4);
      Assert.assertEquals(list[2], elboow.findIceCreamConeWithSmallestVolume());
      
      IceCreamConeList2 elbow = new IceCreamConeList2("help", null, 0);
      Assert.assertEquals(null, elbow.findIceCreamConeWithSmallestVolume());
   }

   
   /** Tests for findIceCreamConeWithLargestVolumeTest.
    * @throws FileNotFoundException yeah.*/
   @Test public void findIceCreamConeWithLargestVolumeTest()
      throws FileNotFoundException
   {
      IceCreamCone[] list = new IceCreamCone[100];
      IceCreamConeList2 coneList = new IceCreamConeList2("", list, 0);
      coneList = coneList.readFile("IceCreamCone_data_1.txt");
      
      IceCreamCone j = new IceCreamCone("Ex 3", 123.4, 900);
      
      Assert.assertEquals(j, coneList
                           .findIceCreamConeWithLargestVolume());
      
      IceCreamConeList2 coneList2 = new IceCreamConeList2("", null, 0);
      coneList = coneList.readFile("IceCreamCone_data_0.txt"); 
      
      Assert.assertEquals(null, coneList
                           .findIceCreamConeWithLargestVolume());
   }
}
