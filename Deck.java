package warGame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
//	b.	Deck

//	i.	Fields
//	1.	cards (List of Card)

//	ii.	Methods
//	1.	shuffle (randomizes the order of the cards)
//	2.	draw (removes and returns the top card of the Cards field)
//	3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	private ArrayList<Card> cards = new ArrayList<>();
	private String[] suits = {"Diamond", "Hearts", "Clubs", "Spades"};
	
	
	Deck(){
		for(int cardValue = 2; cardValue <= 14; cardValue++) {
			for(String suit: suits) {
				Card card = new Card(cardValue, suit);
				cards.add(card);
			}
		}	
	}

	public Card drawTopCard() {
		return cards.remove(0);
	}

	void shuffle() {
		Collections.shuffle(cards);
	}

	public Card draw() {
		// TODO Auto-generated method stub
		return null;
	}


}
