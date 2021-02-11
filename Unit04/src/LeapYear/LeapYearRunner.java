package LeapYear;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		System.out.println("Enter a year");
		Scanner keyboard = new Scanner(System.in);
		int myYear = keyboard.nextInt();
		LeapYear myBoolean = new LeapYear();
		System.out.println(LeapYear.isLeapYear(myYear));
		
		
	}
}