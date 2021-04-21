package NumberSorter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
		        System.out.println(number % 10);
		        number = number / 10; 
		 }
		return count;
		 
	}

	public static int[] getSortedDigitArray(int number)
	{
		getNumDigits(number);
		int[] sorted = null;
		return sorted;
	}
}