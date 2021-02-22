package Word;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner( System.in);
		
		out.println("Enter word: ");
		String wordEntered = keyboard.nextLine();
		
		Word test = new Word();
		test.setString(wordEntered);
		test.toString();
		System.out.print(test.toString());
	}
}