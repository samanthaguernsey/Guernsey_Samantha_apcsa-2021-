//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		word = "";
		vowels = "";
	}

	public Word(String wrd)
	{
		word = wrd;

	}

	public void setWord(String wrd)
	{
		word  = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;

		for (int i=0 ; i<word.length(); i++){
	         char ch = word.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
		return count;
	    
	
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		setWord(word);
		getNumVowels();
		out.println(word);
		out.println("num vowels == " + getNumVowels());
	   return word + getNumVowels();
	}
}