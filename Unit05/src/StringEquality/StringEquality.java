package StringEquality;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("","");
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{

		if(wordOne.compareTo(wordTwo) == 0) {
			return true;
		}
		else return false;
	}

	public String toString()
	{
		System.out.println(checkEquality());
		if(checkEquality()) {
			return "These strings are equal";
		}
		else return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}