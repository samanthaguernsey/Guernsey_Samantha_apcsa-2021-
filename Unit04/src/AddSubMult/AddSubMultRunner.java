package AddSubMult;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter an amount  :: ");
		double amt = keyboard.nextDouble();
		out.print("Enter amount 2 :: ");
		double amt2 = keyboard.nextDouble();
		System.out.println("Check value with user input = " + AddSubMult.check(amt, amt2));
		
		System.out.println( AddSubMult.check( 10, 20) );		
		System.out.println( AddSubMult.check( 20, 10) );	
		System.out.println( AddSubMult.check( 20, 20) );
		System.out.println( AddSubMult.check( 10, 10) );	
		System.out.println( AddSubMult.check( 0, 1) );	
		System.out.println( AddSubMult.check( 1, 0 ) );	
		System.out.println( AddSubMult.check( 3.1, 5.7) );	
		System.out.println( AddSubMult.check( 5.2, 3.8 ) );	
		System.out.println( AddSubMult.check( 5342, 323 ) );						
	}
}