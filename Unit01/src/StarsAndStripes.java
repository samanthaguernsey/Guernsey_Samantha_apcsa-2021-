//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   for(int i = 0; i < 20; i++){
	       System.out.print("*");
	   }
	   System.out.println("");
   }

   public void printTwentyDashes()
   {
	   for(int i = 0; i < 20; i++){
	        System.out.print("-");
	      }
	   System.out.println("");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("");
	   System.out.println("");
   }
   
   public void printASmallBox()
   {	
	   for(int i = 0; i < 3; i++){
	        printTwentyDashes();
	        printTwentyStars();
	      }
	        printTwentyDashes();

   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	      for(int i = 0; i < 2; i++){
	        printTwentyDashes();
	        printTwentyStars();
	      }  
   }
   public static void main(String[] args) {
	   System.out.println("Stars and stripes: ");
	   StarsAndStripes sas = new StarsAndStripes();
	   sas.printASmallBox();
	   
	   sas.printTwoBlankLines();
	  
	   sas.printABigBox();
	   sas.printTwentyDashes();
	   
   }
}