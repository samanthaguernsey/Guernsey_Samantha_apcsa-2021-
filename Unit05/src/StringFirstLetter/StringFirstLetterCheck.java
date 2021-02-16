package StringFirstLetter;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck()
	{
		setWords("","");
	}

	public StringFirstLetterCheck(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkFirstLetter( )
	{
		System.out.println(wordOne.charAt(0));
		System.out.println(wordTwo.charAt(0));
		char one = wordOne.charAt(0);
		char two = wordTwo.charAt(0);
		if(one == two) {
			return false;
		}
		else return true;
	}

	public String toString()
	{
		
		if(checkFirstLetter()) {
	   return wordOne + " does not have the same first letter as " + wordTwo + "\n";
	}
		else return "First letters are the same";
}
}