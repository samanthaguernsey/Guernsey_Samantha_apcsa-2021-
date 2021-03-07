package OddToEven;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean x = false;
		int d = 0;
		int max = -1;
		for(int i = 0; i < ray.size(); i ++)
		{
			if(ray.get(i) % 2 != 0 && !x)
			{
				x = true;
			}
			else if(x && ray.get(i) % 2 != 0)
			{
				d++;
			}
			else if(x && ray.get(i) % 2 == 0)
			{
				d++;
				if(d > max)
				{
					max = d;
				}
				
			}
			
		}
		return max;
	}


}