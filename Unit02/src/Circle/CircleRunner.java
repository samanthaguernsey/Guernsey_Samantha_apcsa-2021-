package Circle;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.Scanner;
public class CircleRunner
{
	public static void main( String[] args )
   {
		System.out.println("Enter a radius: ");
		Scanner keyboard = new Scanner(System.in);
		double myRadius = keyboard.nextDouble();
		System.out.printf("Circle area is :: %.2f\n" , Circle.area( myRadius ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 7.5 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 10 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 72.534 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 55 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 101 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 99.952 ) );
		System.out.printf( "Circle area is :: %.2f\n" , Circle.area( 100 ) );		
	}
}