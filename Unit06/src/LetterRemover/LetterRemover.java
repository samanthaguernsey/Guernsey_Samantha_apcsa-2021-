package LetterRemover;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
		sentence = "";
		lookFor = ' ';
	}

	public LetterRemover(String s, char rem) 
	{
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		
		String cleaned = "";
		int loc = 0;
				
		
		while(sentence.indexOf(lookFor) < sentence.length()) {
			System.out.println("Looping");
			cleaned += sentence.substring( loc, sentence.indexOf(lookFor) );
			loc = sentence.indexOf(lookFor);
		}
		
		return cleaned;
		
	}

	public String toString()
	{
	
		removeLetters();
		return sentence + " - letter to remove " + lookFor;
	}
}