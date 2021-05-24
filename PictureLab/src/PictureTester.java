/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	static int count = 0;
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.explore();
    swan.edgeDetection(30);
    swan.explore();
  }
  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(30);
    swan.explore();
  }
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  /** Method to test Grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Grayscale();
    beach.explore();
  }
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  
  /** Method to test mirrorTemple */
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.negate();
    snowman.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorGull()
  {
    Picture gull = new Picture("images/seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test copy */
  public static void testCopy()
  {
    Picture gull = new Picture("gull.jpg");
    gull.explore();
    gull.copy(gull, 12, 14);
    gull.explore();
  }
  

  
  public static void testSetRedToHalfValueInTopHalf()
  {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.setRedToHalfValueInTopHalf();
    motorcycle.explore();
  }
  
  public static void testClearBlueOverValue(int threshold )
  {
    Picture motorcycle = new Picture("images/femaleLionAndHall.jpg");
    motorcycle.explore();
    motorcycle.clearBlueOverValue(threshold);
    motorcycle.explore();
  }
  public static void testGetCountRedOverValue(int redValue )
  {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.explore();
    System.out.println(motorcycle.getCountRedOverValue(redValue));
  
  }
  
  public static void testfixUnderwater()
  {
    Picture gull = new Picture("images/seagull.jpg");
    gull.explore();
    gull.fixUnderwater();
    gull.explore();
  }
  
  public static void testMirorDiagonal()
  {
    Picture gull = new Picture("images/seagull.jpg");
    gull.explore();
    gull.mirrorDiagonal();
    gull.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
 //   testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
  //  testGrayscale();f
	//  testfixUnderwater();
  // testMirrorVertical();
//    testMirrorTemple();
//    testMirrorArms();
 //   testMirrorGull();
// testMirorDiagonal();
//    testCollage();
//     testCopy();
 //   testEdgeDetection();
//    testEdgeDetection2();
   
  //  testGetCountRedOverValue(250); //inc counter if over 250
   // testSetRedToHalfValueInTopHalf(); //grad  red in top half of image set to half its value
  //  testClearBlueOverValue(200); //make 0
   
  }
}