package MultTens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		String myString = "";
		if(x <= 0)
		{
			return "aplus";
		}
		for(int i = 1; i < x+1; i++)
		{
			myString += i + "0"; 
		}
		return myString;
	}
}