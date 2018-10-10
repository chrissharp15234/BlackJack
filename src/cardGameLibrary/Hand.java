package cardGameLibrary;

import java.util.Set;
import java.util.HashSet;

import java.util.Iterator;

public class Hand {

	private Set<Card> hand = new HashSet<Card>();
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public Set<Card> getHand() {
		return hand;
	}
	
	public Iterator<Card> getIterator(){
		return hand.iterator();
	}
}
