package RoundSum;

public class RoundSum {

	private int a;
	private int b;
	private int c;
	
	public RoundSum()
	{
		setRoundSum(0, 0, 0);
	}
	
	public RoundSum(int one, int two, int three)
	{
		this.a = one;
		this.b = two;
		this.c = three;
	}
	
	public void setRoundSum(int one, int two, int three)
	{
		this.a = one;
		this.b = two;
		this.c = three;
	}
	
	public int round10(int num)
	{
		if(num % 10 < 5)//12 % 10 = remainder 2 , 10 goes into 12 once then remainder 2
		{
			num = num / 10 * 10; //number = 12 / 10 so 1 * 10 so 10
		}
		
		else
		{
			num = num / 10 * 10 + 10; //15 / 10 = 1 * 10 = 10 + 10 = 20
		}
		
		return num;
		
		
		
	}
	public String toString()
	{
		
		
		return String.valueOf(round10(a) + round10(b) + round10(c));
	}
	


public static void main(String[] args)
{
	RoundSum test = new RoundSum();
	test.setRoundSum(16, 17, 18);
	test.toString();
	System.out.println(test.toString());
}
}
