package example;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public Distance()
	{
		setCoordinates(0,0,0,0);
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne,yOne,xTwo,yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
			
	}

	public void calcDistance()
	{
		
		double xAnswer = Math.pow(x2-x1, 2);
		double yAnswer = Math.pow(y2-y1, 2);
		double addedAnswer = xAnswer + yAnswer;
		distance = Math.sqrt(addedAnswer);
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	
	//complete print or the toString

	public String toString()
	{
		String strDistance = String.valueOf(distance);
		return strDistance;
		
	}
	

}