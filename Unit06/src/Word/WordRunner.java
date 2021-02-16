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
		out.println("You entered " + wordEntered);
		out.println("First char: " + test.getFirstChar());
		out.println("Last char: " + test.getLastChar());
		out.println("Backwards: " + test.getBackWards());
	}
}