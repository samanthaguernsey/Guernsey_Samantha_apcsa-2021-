package RomanNumeral;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		int sum = 0; 
		for(int x = 0; x < str.length(); x++)
		{
			String temp = " " + str.charAt(x);
			if(temp.equals(LETTERS[x]))
				sum += NUMBERS[x];
		}
		number = sum;
	}

	public RomanNumeral(Integer orig)
	{
		String myRom = "";
		int temp = orig;
		for(int x = 0; x < NUMBERS.length; x++)
		{
			if(temp-NUMBERS[x] >= 0)
			{
				myRom+=LETTERS[x];
				temp -= NUMBERS[x];
				x=0;
			}
		}
 
		roman = myRom;	
	}

	//write a set number method
	public void setNumber(int orig)
	{
		String myRom = "";
		int temp = orig;
		for(int x = 0; x < NUMBERS.length; x++)
		{
			if(temp-NUMBERS[x] >= 0)
			{
				myRom+=LETTERS[x];
				temp -= NUMBERS[x];
				x=0;
			}
		}
 
		roman = myRom;
	}
	
	
	//write a set roman method
	public void setRoman(String str)
	{
		int sum = 0; 
		for(int x = 0; x < str.length(); x++)
		{
			String temp = " " + str.charAt(x);
			if(temp.equals(LETTERS[x]))
				sum += NUMBERS[x];
		}
		number = sum;
		this.setNumber(sum);
		
	}

	//write get methods for number and roman
	public int getNumber()
	{
		return this.number;
	}
	public String getRoman()
	{
		return this.roman;
	}
	

	public int compareTo(RomanNumeral r)
	{
		
		
		if(getRoman().compareTo(r.getRoman()) != -1)
		{
			return 0;
		}
		else return -1;
	}

	//write  toString() method
	public String toString()
	{
		
		return "" + roman;
	}
	
	
}