package Deck;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] myRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten", "jack", "queen", "king"};
		String[] mySuits = {"hearts", "diamonds", "clubs", "spades"};
		int[] myValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d = new Deck(myRanks, mySuits, myValues);
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println(" toString:\n" + d.toString());
		System.out.println(" isEmpty:\n" + d.toString());
		System.out.println(" size: " + d.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println(" deal: " + d.deal());
		System.out.println();
		System.out.println();
		
	}
}
