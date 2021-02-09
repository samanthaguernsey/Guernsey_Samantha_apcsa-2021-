package NumberVerify;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6));
		
		System.out.println("Enter an integer: ");
		int intOne = keyboard.nextInt();
		
		
		System.out.println(intOne + " is odd :: " + NumberVerify.isOdd(intOne));
		System.out.println(intOne + " is even :: " + NumberVerify.isEven(intOne));
		
	}
}