//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samantha Guernsey
//Date - Jan 31
//Class - AP CSA
//Lab  - 0a.1output Ascii Box

import java.util.Scanner;

public class AsciiBox
{
	public AsciiBox()
	{
		System.out.println("name Samantha Guernsey \t  date Jan 31 \n\n" );
		System.out.println("+++++++++++++++++++++++++ " );
	}
	public void createBox(String charA, String charB)
	{
		System.out.println("Create box called");
		for(int i = 0; i < 3; i++) //overarching loop
		{
			for(int j = 0; j < 3; j++) //first char loop
			{
				for(int k = 0; k < 20; k++) //20 first char
				{
					System.out.print(charA);
				}
				System.out.println(""); //new line for next char
			}
			for(int l = 0; l < 2; l++) //sec char loop
			{
				for(int m = 0; m < 20; m++)
				{
					System.out.print(charB);
				}
				System.out.println("");
			}
			for(int j = 0; j < 3; j++) //last 3 lines of first char
			{
				for(int k = 0; k < 20; k++) //20 first char
				{
					System.out.print(charA);
				}
				System.out.println(""); //new line for next char
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String charOne, charTwo;
		
		System.out.println("Enter a char :: ");
		charOne = keyboard.nextLine();
		
		System.out.print("Enter another char :: ");
		charTwo = keyboard.nextLine();
		
		AsciiBox box = new AsciiBox();
		box.createBox(charOne, charTwo);
	}
	
}