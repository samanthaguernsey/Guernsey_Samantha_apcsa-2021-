package TriangleWord;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;
class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		word = w;
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		setWord(word);
		
		 int len = word.length()-1;
		int i = 1;

		    System.out.println(String.format("%"+(len+1)+"s", word.charAt(0)));
		    for(int x=0; x<word.length()-2; x++){
		        System.out.print(String.format("%"+(len--)+"s", word.charAt(i)));
		        System.out.println(String.format("%"+(i*2)+"s", word.charAt(i++)));
		    }
		    System.out.println(new StringBuilder(word.substring(1)).reverse().toString() + word);
	return "";	 	      
	
		
}
}
	