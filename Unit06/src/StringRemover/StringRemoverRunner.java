package StringRemover;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

import Word.Word;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner( System.in );
		
		out.println("Enter string: ");
		String wordEntered = keyboard.nextLine();
		out.println("Enter remove string: ");
		String removeEntered = keyboard.nextLine();
		
		StringRemover test = new StringRemover();
		test.setRemover(wordEntered, removeEntered);
	
		out.println(test.toString());
		
		
			
		}
		
		
											
	}
