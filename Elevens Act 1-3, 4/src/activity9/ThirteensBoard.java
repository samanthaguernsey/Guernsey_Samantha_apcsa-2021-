package activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ThirteensBoard extends Board {

 /**
  * The size (number of cards) on the board.
  */
 private static final int BOARD_SIZE = 10;

 /**
  * The ranks of the cards for this game to be sent to the deck.
  */
 private static final String[] RANKS =
  {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

 /**
  * The suits of the cards for this game to be sent to the deck.
  */
 private static final String[] SUITS =
  {"spades", "hearts", "diamonds", "clubs"};

 /**
  * The values of the cards for this game to be sent to the deck.
  */
 private static final int[] POINT_VALUES =
  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

 /**
  * Flag used to control debugging print statements.
  */
 private static final boolean I_AM_DEBUGGING = false;


 /**
  * Creates a new <code>ElevensBoard</code> instance.
  */
  public ThirteensBoard() {
   super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
  }

 /**
  * Determines if the selected cards form a valid group for removal.
  * In Elevens, the legal groups are (1) a pair of non-face cards
  * whose values add to 11, and (2) a group of three cards consisting of
  * a jack, a queen, and a king in some order.
  * @param selectedCards the list of the indices of the selected cards.
  * @return true if the selected cards form a valid group for removal;
  *         false otherwise.
  */
 @Override
 public boolean isLegal(List<Integer> selectedCards) {
  if (selectedCards.size() == 1) {
   return containsPairSum13(selectedCards);
  } else if (selectedCards.size() == 2) {
   return containsKing(selectedCards);
  } else {
   return false;
  }
 }

 /**
  * Determine if there are any legal plays left on the board.
  * In Elevens, there is a legal play if the board contains
  * (1) a pair of non-face cards whose values add to 11, or (2) a group
  * of three cards consisting of a jack, a queen, and a king in some order.
  * @return true if there is a legal play left on the board;
  *         false otherwise.
  */
 @Override
 public boolean anotherPlayIsPossible() {
  List<Integer> cIndexes = cardIndexes();
  return containsPairSum13(cIndexes) || containsKing(cIndexes);
 }

 /**
  * Check for an 11-pair in the selected cards.
  * @param selectedCards selects a subset of this board.  It is list
  *                      of indexes into this board that are searched
  *                      to find an 11-pair.
  * @return true if the board entries in selectedCards
  *              contain an 11-pair; false otherwise.
  */
 private boolean containsPairSum13(List<Integer> selectedCards) {
  for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) 
  {
	  	int k1 = selectedCards.get(sk1).intValue();
   for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) 
   {
	   int k2 = selectedCards.get(sk2).intValue();
   for(int sk3 = sk2 + 1; sk3 < selectedCards.size(); sk3++)
	   int k3 = selectedCards.get(sk3).intValue();
    	if (cardAt(k1).pointValue() + cardAt(k2).pointValue() + cardAt(k3).pointValue() == 11) {
    		return true;
    	}
   }
  }
  return false;
 }

 /**
  * Check for a JQK in the selected cards.
  * @param selectedCards selects a subset of this board.  It is list
  *                      of indexes into this board that are searched
  *                      to find a JQK group.
  * @return true if the board entries in selectedCards
  *              include a jack, a queen, and a king; false otherwise.
  */
 private boolean containsKing(List<Integer> selectedCards) {
  for(Integer kObj : selectedCards)
  {
	  int k = kObj.intValue();
	  if(cardAt(k).rank().equals("king"))
	  {
		  return true;
	  }
	
  }
  return false; 
	 
 }
	public boolean playIfPossible() {

		return playPairSum13IfPossible() || playKingIfPossible();
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 13.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 13-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum13IfPossible() {
		
      List<Integer> cards = cardIndexes();
      
      for (int card : cards) {
         
         for (int n = card + 1; n < BOARD_SIZE; n++) {
            
            List<Integer> toCheck = new ArrayList<Integer>();
            toCheck.add(card);
            toCheck.add(n);
            
            if (containsPairSum13(toCheck)) {
               
               replaceSelectedCards(toCheck);
               
               return true;
            
            }
         }
      } 
      
		return false; 
	}

	/**
	 * Looks for a King.
	 * If found, replace it with the next card in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a king play was found (and made); false otherwise.
	 */
	private boolean playKingIfPossible() {
		
      List<Integer> cards = cardIndexes();
      
      for (int card : cards) {
   
         List<Integer> toCheck = new ArrayList<Integer>();
         toCheck.add(card);
         
         if (containsKing(toCheck)) {
            
            replaceSelectedCards(toCheck);
            return true;
         }
      }
      
		return false;
	}
}



