package CountPairs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int i = 0;

		
		for(i  = 0; i<str.length()-1; i++)
		{
			
			char charOne = str.charAt(i);
			char charTwo = str.charAt(i + 1);
			if(charOne==charTwo)
			{
				count++;
			}
		}
		
		
		return count;
	}
}