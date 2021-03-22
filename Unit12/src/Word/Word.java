package Word;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public Word()
	{
		word = "";
	}
	
	public void setWord(String s)
	{
		this.word = s;
	}
	
	public String getWord()
	{
		return this.word;
	}
	
	
	public int compareTo( Word rhs )
	{	
		
				
		if(word.length() > rhs.getWord().length())
		{
			return 1;
		}
		if(word.length() < rhs.getWord().length())
		{
			return -1;
		}
	


		if(word.length() == rhs.getWord().length())
		{
			for(int i = 0; i < word.length(); i++)
			{
				if(word.charAt(i) > rhs.getWord().charAt(i))
				{
					return 1;
				}
				if(word.charAt(i) < rhs.getWord().charAt(i))
				{
					return -1;
				}
		}
		}
		return 0;
	}

	public String toString()
	{
		return "Word :: "  + word;
	}
}