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
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11,12,13};
		Deck d = new Deck(ranks, suits, pointValues);
		
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
