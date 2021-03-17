package Toy;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;
import java.util.ArrayList;
import WordPrinter.WordPrinter;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toyOne = new Toy("sorry");
		toyOne.setCount(1);
		System.out.println(toyOne);
 
		toyOne = new Toy("ji goe");
		toyOne.setCount(5);
		System.out.println(toyOne);
		
		
	}
}
