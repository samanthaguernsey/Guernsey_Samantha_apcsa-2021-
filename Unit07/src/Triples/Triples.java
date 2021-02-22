package Triples;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples //does GCF do anything
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 1;
		for (int count = 2; count < a; count++){
		   if (a % count == 0 && b % count == 0 && c % count == 0) 
			   gcd = count;
		}

		return gcd;
	}

	public String toString()
	{
			for(int a = 1; a <= number; a++)
			{
				
				for(int b = a; b <= number; b++)
				{
					
					for(int c= b; c <= number; c++)
					{
						if((a*a + b*b == c*c) && (c < number) && (greatestCommonFactor(a, b, c) < 2))
						{
							out.println( a + " " + b + " " + c);
						}
							
					}
				}
			}
		
		
		
		
			
return "done";
		
		
	
	}
}