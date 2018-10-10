package cardGameLibrary;

import java.util.Collections;
import java.util.Stack;

public class Deck {
	
	public Stack<Card> deck = new Stack<Card>();
	
	public static final Deck deckInstance = new Deck();
	
	public Deck(){		
		
		//Push all SPADES cards on the stack
		Card aceOfSpades = new Card(Card.ACE,Card.SPADES);
			deck.push(aceOfSpades);
		Card twoOfSpades = new Card(Card.DEUCE,Card.SPADES);
			deck.push(twoOfSpades);
		Card threeOfSpades = new Card(Card.THREE,Card.SPADES);
			deck.push(threeOfSpades);
		Card fourOfSpades = new Card(Card.FOUR,Card.SPADES);
			deck.push(fourOfSpades);	
		Card fiveOfSpades = new Card(Card.FIVE,Card.SPADES);
			deck.push(fiveOfSpades);
		Card sixOfSpades = new Card(Card.SIX,Card.SPADES);
			deck.push(sixOfSpades);
		Card sevenOfSpades = new Card(Card.SEVEN,Card.SPADES);
			deck.push(sevenOfSpades);
		Card eightOfSpades = new Card(Card.EIGHT,Card.SPADES);
			deck.push(eightOfSpades);
		Card nineOfSpades = new Card(Card.NINE,Card.SPADES);
			deck.push(nineOfSpades);
		Card tenOfSpades = new Card(Card.TEN,Card.SPADES);
			deck.push(tenOfSpades);
		Card jackOfSpades = new Card(Card.JACK,Card.SPADES);
			deck.push(jackOfSpades);
		Card queenOfSpades = new Card(Card.QUEEN,Card.SPADES);
			deck.push(queenOfSpades);	
		Card kingOfSpades = new Card(Card.KING,Card.SPADES);
			deck.push(kingOfSpades);
			
		//Push all HEARTS cards on the stack
		Card aceOfHearts = new Card(Card.ACE,Card.HEARTS);
			deck.push(aceOfHearts);
		Card twoOfHearts = new Card(Card.DEUCE,Card.HEARTS);
			deck.push(twoOfHearts);
		Card threeOfHearts = new Card(Card.THREE,Card.HEARTS);
			deck.push(threeOfHearts);
		Card fourOfHearts = new Card(Card.FOUR,Card.HEARTS);
			deck.push(fourOfHearts);	
		Card fiveOfHearts = new Card(Card.FIVE,Card.HEARTS);
			deck.push(fiveOfHearts);
		Card sixOfHearts = new Card(Card.SIX,Card.HEARTS);
			deck.push(sixOfHearts);
		Card sevenOfHearts = new Card(Card.SEVEN,Card.HEARTS);
			deck.push(sevenOfHearts);
		Card eightOfHearts = new Card(Card.EIGHT,Card.HEARTS);
			deck.push(eightOfHearts);
		Card nineOfHearts = new Card(Card.NINE,Card.HEARTS);
			deck.push(nineOfHearts);
		Card tenOfHearts = new Card(Card.TEN,Card.HEARTS);
			deck.push(tenOfHearts);
		Card jackOfHearts = new Card(Card.JACK,Card.HEARTS);
			deck.push(jackOfHearts);
		Card queenOfHearts = new Card(Card.QUEEN,Card.HEARTS);
			deck.push(queenOfHearts);	
		Card kingOfHearts = new Card(Card.KING,Card.HEARTS);
			deck.push(kingOfHearts);
			
		//Push all CLUBS cards on the stack
		Card aceOfClubs = new Card(Card.ACE,Card.CLUBS);
			deck.push(aceOfClubs);
		Card twoOfClubs = new Card(Card.DEUCE,Card.CLUBS);
			deck.push(twoOfClubs);
		Card threeOfClubs = new Card(Card.THREE,Card.CLUBS);
			deck.push(threeOfClubs);
		Card fourOfClubs = new Card(Card.FOUR,Card.CLUBS);
			deck.push(fourOfClubs);	
		Card fiveOfClubs = new Card(Card.FIVE,Card.CLUBS);
			deck.push(fiveOfClubs);
		Card sixOfClubs = new Card(Card.SIX,Card.CLUBS);
			deck.push(sixOfClubs);
		Card sevenOfClubs = new Card(Card.SEVEN,Card.CLUBS);
			deck.push(sevenOfClubs);
		Card eightOfClubs = new Card(Card.EIGHT,Card.CLUBS);
			deck.push(eightOfClubs);
		Card nineOfClubs = new Card(Card.NINE,Card.CLUBS);
			deck.push(nineOfClubs);
		Card tenOfClubs = new Card(Card.TEN,Card.CLUBS);
			deck.push(tenOfClubs);
		Card jackOfClubs = new Card(Card.JACK,Card.CLUBS);
			deck.push(jackOfClubs);
		Card queenOfClubs = new Card(Card.QUEEN,Card.CLUBS);
			deck.push(queenOfClubs);	
		Card kingOfClubs = new Card(Card.KING,Card.CLUBS);
			deck.push(kingOfClubs);
			
		//Push all DIAMONDS cards on the stack
		Card aceOfDiamonds = new Card(Card.ACE,Card.DIAMONDS);
			deck.push(aceOfDiamonds);
		Card twoOfDiamonds = new Card(Card.DEUCE,Card.DIAMONDS);
			deck.push(twoOfDiamonds);
		Card threeOfDiamonds = new Card(Card.THREE,Card.DIAMONDS);
			deck.push(threeOfDiamonds);
		Card fourOfDiamonds = new Card(Card.FOUR,Card.DIAMONDS);
			deck.push(fourOfDiamonds);	
		Card fiveOfDiamonds = new Card(Card.FIVE,Card.DIAMONDS);
			deck.push(fiveOfDiamonds);
		Card sixOfDiamonds = new Card(Card.SIX,Card.DIAMONDS);
			deck.push(sixOfDiamonds);
		Card sevenOfDiamonds = new Card(Card.SEVEN,Card.DIAMONDS);
			deck.push(sevenOfDiamonds);
		Card eightOfDiamonds = new Card(Card.EIGHT,Card.DIAMONDS);
			deck.push(eightOfDiamonds);
		Card nineOfDiamonds = new Card(Card.NINE,Card.DIAMONDS);
			deck.push(nineOfDiamonds);
		Card tenOfDiamonds = new Card(Card.TEN,Card.DIAMONDS);
			deck.push(tenOfDiamonds);
		Card jackOfDiamonds = new Card(Card.JACK,Card.DIAMONDS);
			deck.push(jackOfDiamonds);
		Card queenOfDiamonds = new Card(Card.QUEEN,Card.DIAMONDS);
			deck.push(queenOfDiamonds);	
		Card kingOfDiamonds = new Card(Card.KING,Card.DIAMONDS);
			deck.push(kingOfDiamonds);	
	}
	
	public static Deck getDeck() {
		return deckInstance;
	}
	
//	public Stack<Card> shuffle(){
//		
//		Collections.shuffle(this.deck);
//		
//		return this.deck;		
//	}
	
	public Card dealCard() {
		return this.deck.pop();
	}
}