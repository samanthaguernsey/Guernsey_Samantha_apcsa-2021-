package OddToEven;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();
		System.out.println(s.go(Arrays.asList(7, 1, 4, 3, 11, 5, 6, 7, 8, 9, 10, 12345, 11)));
	}
}