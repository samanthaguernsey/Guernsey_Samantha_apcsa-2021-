package Perfect;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(496);
		System.out.println(test);
		
		test.setNum(45);
		System.out.println(test);
		
		test.setNum(6);
		System.out.println(test);
		
		test.setNum(14);
		System.out.println(test);
																
	}
}