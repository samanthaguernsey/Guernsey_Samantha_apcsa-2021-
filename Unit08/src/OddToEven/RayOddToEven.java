package OddToEven;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	
	private int[] ray;
	
	public RayOddToEven()
	{
		setRay(new int[] {0,0,0,0,0});
	}
	public RayOddToEven(int[] x)
	{
		setRay(x);
	}
	public void setRay(int[] setX)
	{
		ray = setX;
	}
	
	public int go(int[] ray)
	{
		boolean x = false;
		int d = 0;
		for(int i = 0; i<ray.length; i++)
		{
			if(ray[i] % 2 != 0)
			{
				x = true;
			}
			if(x && ray[i] % 2 != 0)
			{
				d++;
			}
			if(x && ray[i] % 2 == 0)
			{
				return d;
			}
		}
		return -1;
	}
	
	
	
	
	
	public String toString()
	{
		setRay(ray);
		String myGo = String.valueOf(go(ray));
		return myGo;
	}
}