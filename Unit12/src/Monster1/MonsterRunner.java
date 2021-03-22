package Monster1;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int size;
		String name;
		out.println("Enter 1st monster's name: ");
		name = keyboard.next();
		out.println("Enter 1st monster's size: ");
		size = keyboard.nextInt();
		Monster mOne = new Skeleton(name, size);
		out.println("Enter 2nd monster's name: ");
		name = keyboard.next();
		out.println("Enter 2nd monster's size: ");
		size = keyboard.nextInt();
		Monster mTwo = new Skeleton(name, size);
		
		if(mOne.isBigger(mTwo) == true)
		{
			out.println("Monster one is > than Monster two");
			
		}
		
		if(mOne.isSmaller(mTwo) == true)
		{
			out.println("Monster one is < than Monster two");
		}
		
		if(mOne.namesTheSame(mTwo) == true)
		{
			out.println("Monster one has the same name as Monster two");
		}
		
	}
}