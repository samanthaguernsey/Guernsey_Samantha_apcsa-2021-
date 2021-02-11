package OddOrEven;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;



import java.util.Scanner;
public class StringRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Enter a string: ");
		Scanner keyboard = new Scanner(System.in);
		String wordOne = keyboard.nextLine();//user input
		
		//private variable word = wordOne
		StringOddOrEven myWord = new StringOddOrEven(wordOne);
		boolean myBool = myWord.isEven();
		
		if(myBool == true) {
			System.out.println(wordOne + " is even");
		}
		
		else {
			System.out.println(wordOne + " is odd");
		}
		
		
		
	}
}