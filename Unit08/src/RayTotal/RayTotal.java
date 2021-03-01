package RayTotal;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
			int sum = 0;
		  for( int num : ray) {
	          sum = sum+num;
	      }
	      return sum;
	}
}