package BigOrSmall;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;
import java.util.Scanner;
public class BigOrSmallRunner
{
	public static void main( String args[] )
	{
		System.out.println("Enter a value: ");
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		System.out.println("Enter another value: ");
		int b = keyboard.nextInt();
	
		System.out.println(BigOrSmall.check(a, b));
		System.out.println( BigOrSmall.check( 10, 20) );		
		System.out.println( BigOrSmall.check( 20, 10) );	
		System.out.println( BigOrSmall.check( 20, 20) );
		System.out.println( BigOrSmall.check( 10, 10) );	
		System.out.println( BigOrSmall.check( 0, 1) );	
		System.out.println( BigOrSmall.check( 1, 0 ) );	
		System.out.println( BigOrSmall.check( 3, 5) );	
		System.out.println( BigOrSmall.check( 5, 3 ) );	
		System.out.println( BigOrSmall.check( 5342, 323 ) );						
	}
}