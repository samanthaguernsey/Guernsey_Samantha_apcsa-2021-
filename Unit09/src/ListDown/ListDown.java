package ListDown;


import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		for(int i = 1; i < numArray.size(); i++)
		{
			if(numArray.get(i-1) <= numArray.get(i))
			{
				return false;
			}
		}
		return true;
	}	
}