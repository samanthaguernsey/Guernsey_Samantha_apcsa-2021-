package  TriangleFive;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive //triangle isn't right
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 0;
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		setLetter(letter);
		setAmount(amount);
		
		String output="";
		
		for(int i = 0; i < amount; i++)
		{
			char let = letter;
			for(int j = amount; j>i; j--)
			{
				for(int k = 0; k < j; k++)
				{
					if(let>'Z')
					{
						let = 'A';
					}
					
					output+= let;
				}
				
				output += " ";
				let++;
			}
				
			output += "\n";
			
		}
		
		return output;
	}
}