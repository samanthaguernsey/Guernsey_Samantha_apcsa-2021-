package StringRemover;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	public StringRemover()
	{
		setRemover("", "");
	}
	
	public StringRemover(String s, String rem)
	{
		setRemover(s, rem);
	}

	public void setRemover(String s, String rem)
	{
		sentence = s;
		remove = rem;
	}

	public String removeStrings()
	{

		int x = 0;
		int loc = sentence.indexOf(remove);
		String temp = "";

		while(loc != -1)
		{
			loc = sentence.indexOf(remove, x);
			
			if(loc != -1)
			{
				temp += sentence.substring(x, loc-1);
				
				x = loc + remove.length();
				loc = loc + 1;
			}
		
		}
		return temp;
	}

	public String toString()
	{
		return "new string: " + removeStrings();
	}
}