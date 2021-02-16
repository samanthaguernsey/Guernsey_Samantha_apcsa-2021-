package StringFirstLetter;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		System.out.println("Enter string 1: ");
		Scanner keyboard = new Scanner(System.in);
		String wordOne = keyboard.nextLine();
		System.out.println("Enter string 2: ");
		String wordTwo = keyboard.nextLine();
		
		
		StringFirstLetterCheck myWord = new StringFirstLetterCheck();
		myWord.setWords(wordOne, wordTwo);
		System.out.println(myWord.toString());

	}
}