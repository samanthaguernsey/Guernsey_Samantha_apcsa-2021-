package Sum;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	int[]ray;
	
	public RaySumLast() 
	{
		setRay(new int[] {0, 0, 0, 0});
	}
	
	public RaySumLast(int[] x)
	{
		setRay(x);
	}
	public void setRay(int[] setX)
	{
		ray = setX;
	}
	
	public static int go(int[] ray)
	{
		int sum =0;
		for(int i = 0; i < ray.length; i++)
		{
			if(ray[i] > ray[ray.length-1])
			{
				sum+= ray[i];
			}
		}
		return sum;
	}
	public String toString()
	{
		go(ray);
		System.out.println(go(ray));
		return "";
	}
	
}