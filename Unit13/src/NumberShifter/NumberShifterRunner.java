package NumberShifter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;

import NumberSorter.NumberSorter;
import WordSortTwo.WordSortTwo;

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		NumberShifter myShifter =  new NumberShifter();
		int[] array = myShifter.makeLucky7Array(50);
		 
		
		myShifter.shiftEm(array);
 
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}



