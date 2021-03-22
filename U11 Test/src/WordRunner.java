//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;
public class WordRunner
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		Word test = new Word();
		test.setWord(word);
		test.getNumVowels();
		test.toString();
	}
}