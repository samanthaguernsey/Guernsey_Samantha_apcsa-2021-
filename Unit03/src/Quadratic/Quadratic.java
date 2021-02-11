package Quadratic;
//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0,0,0);
		rootOne = 0.0;
		rootTwo = 0.0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = -1 * (double)b + ( Math.sqrt((double)b*b - 4 * (double)a * (double)c) ); 
		rootTwo = -1 * (double)b - ( Math.sqrt((double)b*b - 4 * (double)a * (double)c) ); 
	}

    public void print()
    {

    	System.out.println(rootOne);
    	System.out.println(rootTwo);
    	System.out.println(a);
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}