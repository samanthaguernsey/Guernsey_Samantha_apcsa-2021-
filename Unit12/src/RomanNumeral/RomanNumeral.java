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
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		//convert here
	}

	//write a set number method
	
	
	
	//write a set roman method


	//write get methods for number and roman
	
	

	public int compareTo(RomanNumeral r)
	{
		//compare integers
		return 0;
	}

	//write  toString() method
	
	
	
}