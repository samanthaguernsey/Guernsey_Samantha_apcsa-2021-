package SumFirst;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
import java.util.List;
public class ListSumFirst

{
	int[]ray;
	
	public static int go( List<Integer> ray)
	{
		int sum =0;
		for(int i = 0; i < ray.size(); i++)
		{ 
			if(ray.get(i) > ray.get(0))
			{
				sum+= ray.get(i);
			}
		}
		return sum;
	}
/*	public String toString()
	{
		go(ray);
		System.out.println(go(ray));
		return "";
	}
	*/
}