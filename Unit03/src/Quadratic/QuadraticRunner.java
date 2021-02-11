package Quadratic;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		
		System.out.println("Enter a :: ");
		Scanner keyboard = new Scanner(System.in);
		int myA = keyboard.nextInt();
		System.out.println("Enter b :: ");
		int myB = keyboard.nextInt();
		System.out.println("Enter c :: ");
		int myC = keyboard.nextInt();
		Quadratic myQuad = new Quadratic();
		
		myQuad.setEquation(myA, myB, myC);
		myQuad.print();
	
	}
}