package example;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main(String[] args) {
			
		   Scanner keyboard = new Scanner(System.in);
		   
		   out.println("Enter x1 ");
		   int intOne = keyboard.nextInt();
		   
		   out.println("Enter y1");
		   int intTwo = keyboard.nextInt();
		   
		   out.println("Enter x2 ");
		   int intThree = keyboard.nextInt();
		   
		   out.println("Enter y2 ");
		   int intFour = keyboard.nextInt();
		   
		   
		
		   Distance myDistance = new Distance();
		  
		   myDistance.setCoordinates(intOne, intTwo, intThree, intFour);
		   
		   myDistance.calcDistance();
		   out.println(myDistance.toString());
		   
	}
}