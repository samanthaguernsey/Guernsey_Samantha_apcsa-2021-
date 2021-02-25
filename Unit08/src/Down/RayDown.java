package Down;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.lang.reflect.Array;

public class RayDown
{
	
	int[] ray;
	
	public RayDown()
	{
		setRay(new int[] {0,0,0});
	}
	
	public RayDown(int[] x)
	{
		setRay(x);
	}
	
	public void setRay(int[] setX)
	{
		ray = setX;
	}
	
	public static boolean go(int[] numArray)
	{
		boolean myBool = true;

	      for (int i = 1; i < numArray.length; i++) {
	    	 
	         if (numArray[i-1] <= (numArray[i]) ) {
	        	 
	        	 myBool = false;
	             } 
	         	else 
	         	{
	                 myBool = true;
	         	} 


	          } 

	      return myBool;
		
	}	
	    
	public String toString()
	{
		setRay(ray);
		boolean myBool2 = go(ray);
		
		if(myBool2) {
			return go(ray) + "";
		}
		else return "false";
}
}