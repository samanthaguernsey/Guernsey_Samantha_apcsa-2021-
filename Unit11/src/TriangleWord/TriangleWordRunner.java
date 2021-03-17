package TriangleWord;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		System.out.println("Enter a word :: ");
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		
		TriangleWord.printTriangle(word);
	}
}