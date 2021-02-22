package BiggestDouble;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
		
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if(one > two)
		{
			if(one > three) 
			{
				if(one > four)
				{
					return one;
				}
				else
				{
					return four;
				}
			}
			else
			{
				if(three > four)
				{
					return three;
				}
				else
				{
					return four;
				}
			}
		}
		else
		{
			if(two > three)
			{
				if(two > four)
				{
					return two;
				}
				else
				{
					return four;
				}
			}
			else
			{
				if(three > four)
				{
					return three;
				}
				else
				{
					return four;
				}
			}
		}
		
	
	}

		

	public String toString() //what to do with to string
	{
		setDoubles(one, two, three, four);
	
		
	   return "biggest: " + getBiggest();
	}
}