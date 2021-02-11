package Distance;
//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		setCoordinates(0,0,0,0);
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne, yOne, xTwo, yTwo);

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;

	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";

		distanceB = Math.sqrt((x2-0)*(x2-0)+(y2-0)*(y2-0));
		distanceA = Math.sqrt((x1-0)*(x1-0)+(y1-0)*(y1-0));
		
		double closest = Math.min(distanceA, distanceB);
		
		if(closest == distanceB)
		{
			result = "B is closer to (0,0)";
		}
		else
		{
			result = "A is closer to (0,0)";
		}
		return result;
				
	}
	
	public String toString()
	{
		return ""+x1+ " " + y1 + " " + x2 + " " + y2;
	}
}