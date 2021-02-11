package StringEquality;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 
import java.util.Scanner;

import FirstLastVowel.FirstLastVowel;
import OddOrEven.StringOddOrEven;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		System.out.println("Enter string 1: ");
		Scanner keyboard = new Scanner(System.in);
		String wordOne = keyboard.nextLine();
		System.out.println("Enter string 2: ");
		String wordTwo = keyboard.nextLine();
		
		
		
		
		StringEquality myWord = new StringEquality();
		myWord.setWords(wordOne, wordTwo);
		System.out.println(myWord.toString());
		
		
	}
}