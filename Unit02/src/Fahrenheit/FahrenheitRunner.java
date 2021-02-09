package Fahrenheit;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
public class FahrenheitRunner
{
   public static void main( String[] args )
   {
	    System.out.println("Enter a double");
	    Scanner keyboard = new Scanner(System.in);
	    double myDouble = keyboard.nextDouble();
	    Fahrenheit myFahrenheit = new Fahrenheit();
	    System.out.printf("%.2f degrees Celsius \n", myFahrenheit.convert(myDouble));//private or public
	    System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert(myDouble));//public
 		System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert( 98.6 ));
		System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert( 52.3 ));
		System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert( 82.45 ));
		System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert( 75 ));
		System.out.printf("%.2f degrees Celsius \n", Fahrenheit.convert( 100 ));

	}
}