package LabAssess1;


public class Numbers{
	 
	
	private int number;;
	
	public Numbers()
	{
		setNum(0);
	}
	public Numbers(int num)
	{
		setNum(num);
	}
	
	public void setNum(int num)
	{
		if(number >= 0)
		{
			number = num;
		}
		
	}
	
	public static boolean isGoofy(int num)
	  {  
		int[] myArray = {0};
		int sum = 0;
	
		String b = String.valueOf(num);
		for(int i = 0; i < b.length(); i++)
		{
			if(num % (int)b.charAt(i) == 0)
			{
				myArray[i] = b.charAt(i);
			}
		}
	     for(int i = 0; i < myArray.length; i++)
	     {
	    	sum += myArray[i];
	     }
	    
	     if(sum % 2 != 0)
	     {
	    	 return true;
	     }
	     else
	    	 return false;
	  }

	 public static int[] getSomeGoofyNumbers(int count)
	  {
		 
		count = 0;
		
		for(int i = 0; i < count; i++)
		{
			isGoofy(i);
			if(isGoofy(i))
			{
				count++;
			}
			
		}
		return count;
		
	  }	
	   
	public String toString()
	{
		setNum(number);

		if(isGoofy(number))
		{
			return String.valueOf(isGoofy(number));
		}
		else return "";
	}
	 
	 public static void main(String[] args)
	 {
		 System.out.println("Samantha Guernsey March 1 P3");
		 Numbers test = new Numbers(3);
		 System.out.println(test);
		 
		 Numbers test2 = new Numbers(20);
		 System.out.println(test2);
	 }

}

