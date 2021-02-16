package Word;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char firstChar = word.charAt(0);
		return firstChar;
	}

	public char getLastChar()
	{
		char lastChar = word.charAt(word.length()-1);
		return lastChar;
	}

	public String getBackWards()
	{
		String back="";
		
		for(int i = word.length()-1; i > -1; i--) {
			back += String.valueOf(word.charAt(i));
		}
		
		
		return back;
	}

 	public String toString()
 	{
 		return "";
	}
}