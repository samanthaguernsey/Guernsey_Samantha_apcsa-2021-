import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)//row
    {
      for (Pixel pixelObj : rowArray)//column, getting individual pixel
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  
 
  
  
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
   
    for (int row = 27; row < 97; row++)
    {
    
      for (int col = 13; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
	  Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
          for (int col = 0; 
          col < pixels[0].length-1; col++)
          {
              leftPixel = pixels[row][col];
              rightPixel = pixels[row][col+1];
              rightColor = rightPixel.getColor();
              if (leftPixel.colorDistance(rightColor) > 
              edgeDist)
                  leftPixel.setColor(Color.BLACK);
              else
                  leftPixel.setColor(Color.WHITE);
          }
      }
    
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  
	  for(Pixel p : row)
	  {
		  p.setRed(0);
		  p.setGreen(0);
	  }
  }
  
  
  public void keepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  
	  for(Pixel p : row)
	  {
		  p.setBlue(0);
		  p.setRed(0);
	  }
  }
  
  public void keepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  
	  for(Pixel p : row)
	  {
		  p.setBlue(0);
		  p.setGreen(0);
	  }
  }
  public void Grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel pixelObj : row)
		  {
			 int average = (pixelObj.getGreen() + pixelObj.getBlue() + pixelObj.getRed()) / 3;
			 pixelObj.setGreen(average);
			 pixelObj.setRed(average);
			 pixelObj.setBlue(average);
		  }
	  }
  }
  
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
		  for(Pixel p : row)
		  {
			  p.setRed(255 - p.getRed());
			  p.setGreen(255 - p.getGreen());
			  p.setBlue(255 - p.getBlue());
		  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 350;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  
	  for(int row = 225; row < 332; row++)
	  {
		  
		  for(int col = 219; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
		  
	  }
	
  }
  
 
  public void mirrorArms(){
	  int mirrorPoint = 205;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    for (int row = 152; row < 200; row++)
	    {
	      for (int col = 92; col < mirrorPoint; col++)
	      {
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixel = null;
      for ( int row = 0; row < pixels.length; row++ )
      {
          for ( int col = 0; col < pixels[0].length; col++ )
          {
              pixel = pixels[row][col];
              pixel.setRed( pixel.getRed() * 3 );
          }
      }
  }
  
  public void mirrorDiagonal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int length = pixels.length;
      for (int row = 0; row < length; row++)
      {
          for (int col = 0; col < row+1; col++)
          {
              topPixel = pixels[col][row];
              bottomPixel = pixels[row][col];
              topPixel.setColor(bottomPixel.getColor());
          }
      } 
  }

  public void edgeDetection2(int edgeDist)
  {
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      Color bottomColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
          for (int col = 0; col < pixels[0].length-1; col++)
          {
              leftPixel = pixels[row][col];
              rightPixel = pixels[row][col+1];
              rightColor = rightPixel.getColor();
              if (leftPixel.colorDistance(rightColor) > 
              edgeDist)
                  leftPixel.setColor(Color.BLACK);
              else
                  leftPixel.setColor(Color.WHITE);
          }
      }
      for (int col = 0; col < pixels[0].length; col++)
      {
          for(int row = 0; row < pixels.length - 1; row++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[row+1][col];
              bottomColor = bottomPixel.getColor();
              if (topPixel.colorDistance(bottomColor) > 
              edgeDist)
                  topPixel.setColor(Color.BLACK);
              else
                  topPixel.setColor(Color.WHITE);
          }
      }
      
      
  }
  

  public void setRedToHalfValueInTopHalf()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(int i = 0; i <= pixels.length/2; i++)
	  {
		  for(int j = 0; j < pixels[i].length; j++)
		  {
			  pixels[i][j].setRed(pixels[i][j].getRed()/2);
		  }
	  }
	  
	  
  }
  
  public void clearBlueOverValue(int threshold)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(int i = 0; i < pixels.length; i++)
	  {
		  for(int j = 0; j < pixels[i].length; j++)
		  {
			 if(pixels[i][j].getBlue() > threshold)
			 {
				 pixels[i][j].setBlue(0);
			 }
		  }
	  }
	  
	  
  }

  public int getCountRedOverValue(int redValue)
  {
	  int counter = 0;
	  Pixel[][] pixels = this.getPixels2D();
	  for(int i = 0; i < pixels.length; i++)
	  {
		  for(int j = 0; j < pixels[i].length; j++)
		  {
			 if(pixels[i][j].getRed() > redValue)
			 {
				 counter++;
			 }
		  }
	  }
	  return counter;

  }
 
  /**
   * Method to replace the blue background with the pixels in the newBack
   * picture
   * 
   * @param newBack
   *            the picture to copy from
   */
  public void chromakey( Picture newBack )
  {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = newBack.getPixels2D();
      for ( int row = 0; row < this.getHeight(); row++ )
      {
          for ( int col = 0; col < this.getWidth(); col++ )
          {
              toPixel = toPixels[row][col];
              if ( toPixel.getBlue() > toPixel.getRed() )
              {
                  fromPixel = fromPixels[row][col];
                  toPixel.setColor( fromPixel.getColor() );
              }
          }
      }
  }
  
  
  
} // this } is the end of class Picture, put all new methods before this
