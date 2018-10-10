package blackjack;

import java.util.Collections;
import java.util.Iterator;

import cardGameLibrary.Card;
import cardGameLibrary.Deck;
import cardGameLibrary.Player;

import java.util.Scanner;


public class Game {
	
	//Declare a Deck, a Card, player and dealer hands, Deck size, and handIterators
	Deck cardDeck = Deck.getDeck();
	Card card = null;
	int cardDeckSize;
	Iterator<Card> dealerHandIterator, playerHandIterator;
	Scanner sc;
	
	//Declare player variables
	Player dealer, player1;
	
	String input;
	
	@SuppressWarnings("unlikely-arg-type")
	public Game() {
		
		//Create a Deck and a Card and get Deck size
		cardDeckSize = cardDeck.deck.size();
				
		//Shuffle the Deck
		this.shuffleDeck();
				
		//Create Players
		this.createPlayers();
		
		//Deal Hand for Player1
		this.dealFirstHand();
		
		//Let's see what the Dealer hand is
		this.showDealerHand();
		
		//Let's see what the Player hand is
		this.showPlayerHand();
		
		//Does Player1 want to be hit?--------------
		System.out.println("\nWould you like to be hit?");
		sc = new Scanner(System.in);
		input = sc.next();
		
		while(input.equals("y") || input.equals("Y") || input.equals("yes")){
			hitMe();
			System.out.println("\nWould you like to get hit again?");
			input = sc.next();
		}
		sc.close();
		//------------------------------------------
		
		//Let's see who won
		System.out.println(this.determineWinner());
	}

	private void shuffleDeck() {
		Collections.shuffle(cardDeck.deck);
	}
	
	private void createPlayers() {
		this.dealer = new Player(true);
		this.player1 = new Player(false);
	}
	
	private void dealFirstHand() {
		//Face-down cards, one to each player
		player1.hand.addCard(cardDeck.deck.pop());
		dealer.hand.addCard(cardDeck.deck.pop());
		
		//Face-up cards, one to each player
		player1.hand.addCard(cardDeck.deck.pop());
		dealer.hand.addCard(cardDeck.deck.pop());
	}
	
	private void showDealerHand() {
		
		//Get the Hand Iterator
		dealerHandIterator = dealer.hand.getIterator();
					
		//Skip the first card since it's supposed to be face-down
		card = dealerHandIterator.next(); 
		
		//Show the Dealer's Hand
		System.out.println("The dealer's visible hand is: ");
		while(dealerHandIterator.hasNext()) {
			card = dealerHandIterator.next();
			System.out.println(Card.rankToString(card.getRank()) + " of " + Card.suitToString(card.getSuit()));
		}
	}
	
	private void showPlayerHand() {
		
		//Get the Hand Iterator;
		playerHandIterator = player1.hand.getIterator();
		
		//Show the Player's Hand
		System.out.println("\nYour hand is: ");
		while(playerHandIterator.hasNext()) {
			card = playerHandIterator.next();
			System.out.println(Card.rankToString(card.getRank()) + " of " + Card.suitToString(card.getSuit()));
		}
	}

	private void hitMe() {
		
		//Get card from deck
		card = cardDeck.deck.pop();
		
		//Display this card to the console
		System.out.println(Card.rankToString(card.getRank()) + " of " + Card.suitToString(card.getSuit()));
		
		//Add this to the player1's hand
		player1.hand.addCard(card);
	}
	
	private String determineWinner() {
		
		//Make separator
		System.out.println("----------------------------------------------");
		
		//Get the Hand Iterators
		dealerHandIterator = dealer.hand.getIterator();
		playerHandIterator = player1.hand.getIterator();
		
		System.out.println("The dealer's final hand is:");
		int i=0;
		int j=0;
		while(dealerHandIterator.hasNext()) {
			card = dealerHandIterator.next();
			System.out.println(Card.rankToString(card.getRank()) + " of " + Card.suitToString(card.getSuit()));
			i= i+ card.getRank();
		}
		
		System.out.println("\nThe player's hand is:");
		while(playerHandIterator.hasNext()) {
			card = playerHandIterator.next();
			System.out.println(Card.rankToString(card.getRank()) + " of " + Card.suitToString(card.getSuit()));
			j = j+ card.getRank();
		}
		
		System.out.println("\nThe dealer has " + i + " points." + "\n" + "You have " + j + " points.\n");
		
		if(i>=j && i<=21) {
			return "Dealer wins!";
		}
		else if(j>21) {
			return "Dealer wins!";
		}
		else {
			return "You win!";
		}
			
	}//end determineWinner

}//end Game class
