package activity9;
import java.util.List;
import java.util.ArrayList;
 

public class Activity11ElevensBoard extends Board {
 
	public Activity11ElevensBoard(int size, String[] ranks, String[] suits, int[] pointValues) {
		super(size, ranks, suits, pointValues);
		// TODO Auto-generated constructor stub
	}

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;
 
	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "jack", "queen", "king" };
 
	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS = { "spades", "hearts", "diamonds",
			"clubs" };
 
	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			0, 0, 0 };
 
	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public Activity11ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}
 
	/**
	 * Determines if the selected cards form a valid group for removal. In
	 * Elevens, the legal groups are (1) a pair of non-face cards whose values
	 * add to 11, and (2) a group of three cards consisting of a jack, a queen,
	 * and a king in some order.
	 * 
	 * @param selectedCards
	 *            the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal; false
	 *         otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
	
		if (findPairSum11(selectedCards).size() > 0) {
			// return findPairSum11(selectedCards);
			return true;
		} else if (findJQK(selectedCards).size() > 0) {
			// return findJQK(selectedCards);
			return true;
		} else {
			return false;
		}
	}
 
	/**
	 * Determine if there are any legal plays left on the board. In Elevens,
	 * there is a legal play if the board contains (1) a pair of non-face cards
	 * whose values add to 11, or (2) a group of three cards consisting of a
	 * jack, a queen, and a king in some order.
	 * 
	 * @return true if there is a legal play left on the board; false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		
		List<Integer> cIndexes = cardIndexes();
		if (findPairSum11(cIndexes).size() > 0 || findJQK(cIndexes).size() > 0)
			return true;
		return false;
		// return findPairSum11(cIndexes) || findJQK(cIndexes);
	}
 
	/**
	 * Look for an 11-pair in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find an 11-pair.
	 * @return a list of the indexes of an 11-pair, if an 11-pair was found; an
	 *         empty list, if an 11-pair was not found.
	 */
	private List<Integer> findPairSum11(List<Integer> selectedCards) {
	
		List<Integer> indexes = new ArrayList<Integer>();
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) {
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 11) {
					// return true;
					indexes.add(k1);
					indexes.add(k2);
					System.out.println("PairSum11 indexes = " + indexes);
					return indexes;
				}
			}
		}
		//System.out.println("PairSum11 indexes = " + indexes);
 
		return indexes;
	}
 
	/**
	 * Look for a JQK in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find a JQK group.
	 * @return a list of the indexes of a JQK, if a JQK was found; an empty
	 *         list, if a JQK was not found.
	 */
	private List<Integer> findJQK(List<Integer> selectedCards) {

		List<Integer> indexes = new ArrayList<Integer>();
		 boolean foundJack = false;
		 boolean foundQueen = false;
		 boolean foundKing = false;
	
		
		for (Integer kObj : selectedCards) {
		
			int k = kObj.intValue();
			for(Integer jObj : selectedCards)
			{
			int i = kObj.intValue();
			if (cardAt(k).rank().equals("jack") && cardAt(i).rank().equals("jack")) {
			
				 foundJack = true;
			} else if (cardAt(k).rank().equals("queen") && cardAt(k).rank().equals("queen")) {
				foundQueen = true;
				
			} else if (cardAt(k).rank().equals("king") && cardAt(k).rank().equals("king")) {
				foundKing = true;
				
			}
		}
	
		}
		
		 return foundJack && foundQueen && foundKing;
	
	}
 
	/**
	 * Looks for a legal play on the board. If one is found, it plays it.
	 * 
	 * @return true if a legal play was found (and made); false otherwise.
	 */
	public boolean playIfPossible() {
		
		if (playPairSum11IfPossible() == true || playJQKIfPossible() == true) {
			return true;
		}
		return false;
		// return false; // REPLACE !
	}
 
	/**
	 * Looks for a pair of non-face cards whose values sum to 11. If found,
	 * replace them with the next two cards in the deck. The simulation of this
	 * game uses this method.
	 * 
	 * @return true if an 11-pair play was found (and made); false otherwise.
	 */
	private boolean playPairSum11IfPossible() {
		
		if (findPairSum11(cardIndexes()).size() > 0) {
			System.out.println("playPairSum11 = true");
			return true;
		}
		return false; 
	}
 
	/**
	 * Looks for a group of three face cards JQK. If found, replace them with
	 * the next three cards in the deck. The simulation of this game uses this
	 * method.
	 * 
	 * @return true if a JQK play was found (and made); false otherwise.
	 */
	private boolean playJQKIfPossible() {
	
		if (findJQK(cardIndexes()).size() > 0) {
			return true;
		}
		return false; 
	}
}