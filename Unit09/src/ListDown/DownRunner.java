package ListDown;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class DownRunner
{
	public static void main( String args[] )
	{		
		ListDown s = new ListDown();
		
		System.out.println(s.go(Arrays.asList(-99, 1, 2,  3, 4, 5, 6, 7, 8, 9, 10, 12345)));
		
	}
}