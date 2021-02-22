package TriangleOne;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String myString =  "";
		int size = word.length();
		for(int i = size; i > 0; i--)
		{
			myString += word.substring(0, i) + "\n";
		}
		System.out.println(myString);
	}
}