package Card;
import java.util.Scanner;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Enter rank: ");
		Scanner keyboard = new Scanner(System.in);
		String tempOne = keyboard.next();
		
		System.out.println("Enter suit: ");
		String tempTwo = keyboard.next();
		
		
		int pointValue = 0;
		if(tempOne ==  "ace")
		{
			pointValue = 1;
		}
		else pointValue = 0;
		
		Card myCard = new Card(tempOne, tempTwo, pointValue);
		
		Card aceClubs1 = new Card("ace", "clubs", 1);
		Card aceClubs2 = new Card("ace", "clubs", 1);
		Card sixHearts = new Card("6", "hearts", 6);
		
		System.out.println("**** ace of clubs #1 Tests ****");
		System.out.println(" rank: " + aceClubs1.rank());
		System.out.println(" suit: " + aceClubs1.suit());
		System.out.println(" pointValue: " + aceClubs1.pointValue());
		System.out.println(" toString: " + aceClubs1.toString());
		System.out.println();
		
		System.out.println("**** ace of clubs #2 Tests ****");
		System.out.println(" rank: " + aceClubs2.rank());
		System.out.println(" suit: " + aceClubs2.suit());
		System.out.println(" pointValue: " + aceClubs2.pointValue());
		System.out.println(" toString: " + aceClubs2.toString());
		System.out.println();
		
		System.out.println("**** six of hearts #3 Tests ****");
		System.out.println(" rank: " + sixHearts.rank());
		System.out.println(" suit: " + sixHearts.suit());
		System.out.println(" pointValue: " + sixHearts.pointValue());
		System.out.println(" toString: " + sixHearts.toString());
		System.out.println();
	}
}
