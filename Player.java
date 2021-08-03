package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
//	c.	Player
	
//	i.	Fields
//	1.	hand (List of Card)
//	2.	score (set to 0 in the constructor)
//	3.	name
	
//	ii.	Methods
//	1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//	2.	flip (removes and returns the top card of the Hand)
//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//	4.	incrementScore (adds 1 to the Player’s score field)
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	
	public Player() {
		this.score = 0;
		this.name = "";
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Name of the player: " + name);
		System.out.println("Score of the player: " + score);
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		Card c = new Card();
		c = deck.drawTopCard();
		hand.add(c);
//		c.describe();
	}
	
	public void incrementScore() {
		score++;
	}
}
