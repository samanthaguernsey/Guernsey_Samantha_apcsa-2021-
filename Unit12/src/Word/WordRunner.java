package Word;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
 
public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
	
		
			Scanner file = new Scanner(new File("words.dat"));
			int size = file.nextInt();
			
			Word [] words = new Word[size];
			file.nextLine();
 
			for(int i = 0; i < size; i++)
			{
				words[i] = new Word(file.next());
			}

			
			Arrays.sort(words);
			for(int i = 0; i < size; i++)
			{
				System.out.println(words[i]);
			}
 
			System.out.println("\n");
	}
	
}