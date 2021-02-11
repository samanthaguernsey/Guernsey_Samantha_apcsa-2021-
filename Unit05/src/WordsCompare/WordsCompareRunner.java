package WordsCompare;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import StringEquality.StringEquality;
public class WordsCompareRunner
{
   public static void main( String args[] )
   {	
	   	System.out.println("Enter a word: ");
		Scanner keyboard = new Scanner(System.in);
		String myWordOne = keyboard.nextLine();
		System.out.println("Enter word 2: ");
		String myWordTwo = keyboard.nextLine();
		
		WordsCompare myWords = new WordsCompare();
		myWords.setWords(myWordOne, myWordTwo);
		System.out.println(myWords.toString());

	}
}