package Rational;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;

	public Rational()
	{
		numerator = 1;
		denominator = 1; 
	}
	public Rational(int num, int den)
	{ 
		numerator = num; denominator = den;
	}

	public void setRational(int num, int den)
	{
		setNumerator(num); setDenominator(den);
	}
	public void setNumerator(int num)
	{
		numerator = num;
	}
	public void setDenominator(int den)
	{
		denominator = den;
	}
	
	
	
	public void add(Rational other) {
	    setNumerator( (getNumerator() * other.denominator ) + ( other.numerator * getDenominator() ));
	    setDenominator( getDenominator() * other.denominator );
	    
	    reduce();
	  
	}
	
	private void reduce() 
	{
	    setNumerator(numerator / gcd(numerator, denominator));
	    setDenominator(denominator / gcd(numerator, denominator));
	}
	
	private int gcd(int numOne, int numTwo) {
	    if (numTwo == 0) 
	    	return numOne;
	    return gcd(numTwo,numOne % numTwo);
	}
	
	
	public Object clone()
	{ 
		return new Rational(getNumerator(), getDenominator()); 
	}
	
	
	
	public int getNumerator()
	{ 
		return numerator;
	}
	public int getDenominator()
	{ 
		return denominator;
	}
	


	public boolean equals(Object obj)
	{ 
		return compareTo((Rational)obj) == 0;
	}




	public int compareTo(Rational other) {
			Rational num1 = new Rational(numerator, denominator);
		    Rational num2 = new Rational(other.getNumerator(), other.getDenominator());
		    num1.reduce();
		    num2.reduce();

		    if (num1.getDenominator() < num2.getDenominator()) {
		      return -1;
		    } else if (num1.getDenominator() == num2.getDenominator()) {
		      if (num1.getNumerator() < num2.getNumerator()) {
		        return -1;
		      } else if (num1.getNumerator() > num2.getNumerator()) {
		        return 1;
		      } else {
		        return 0;
		      }
		    } else {
		      return 1;
		    }
	}

	public String toString() {
	    return numerator + "/" + denominator;
	}
}
