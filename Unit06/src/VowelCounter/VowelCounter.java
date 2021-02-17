package VowelCounter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		int i = 0;
		for(i = 0; s.matches(".*[AEIOUaeiou].*"); i++)
		{
		 s = s.replaceFirst("[AEIOUaeiou]", Integer.toString(i));
		}
	       
	    return s;
	}
	}
	
	



