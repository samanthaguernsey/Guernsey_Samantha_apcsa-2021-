package Down;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.out;



public class DownRunner
{
	
	

	public static void main( String args[] )
	{	
		int numArray[] = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		RayDown test = new RayDown();
		test.setRay(numArray);
		out.println(test.toString());

		int numArray2[] = {10,9,8,7,6,5,4,3,2,1,-99};
		RayDown test2 = new RayDown();
		test2.setRay(numArray2);
		out.println(test2.toString());
		
		
	}
}