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
		int size = word.length();
		for(int i = 1; i <= size; i++)
		{
			for(int j = 0; j <= size; j++)
			{
				if(j<=i)
				out.print(word.substring(0,i));
			}
			out.println("");
		}
	}
}