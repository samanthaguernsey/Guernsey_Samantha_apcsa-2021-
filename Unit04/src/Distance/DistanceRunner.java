package Distance;
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
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println("\n test1 : " + test.determineClosest());
		out.println("\n Here are the inputs used: " + test);
	
		//add more test cases
		
		Distance test2 = new Distance(xOne, yOne, xTwo, yTwo);
		out.print("Enter X1 :: ");
		int xOne1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo1 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo1 = keyboard.nextInt();
		out.println("\n test2: " + test2.determineClosest());
		out.println("\n Here are the inputs used: " + test2);
	}
}