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
		String removeLetters = "";
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == lookFor)
			{
				removeLetters += sentence.charAt(i);
			}
			else
			{
				cleaned += sentence.charAt(i);
			}
			
		}
		out.println(removeLetters);
		
		return cleaned;
		
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " / cleaned: " + removeLetters();
	}
}