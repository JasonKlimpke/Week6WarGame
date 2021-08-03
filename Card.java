package warGame;

public class Card {
//	a.	Card
	
//	i.	Fields
	
//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	
//	ii.	Methods
	
//	1.	Getters and Setters
//	2.	describe (prints out information about a card)
private int cardValue;
private String cardSuit;

Card(){
	
}


Card(int cV, String cS){
	this.cardValue = cV;
	this.cardSuit = cS;
}

public int getCardValue() {
	return cardValue;
}

public void setCardValue(int cardValue) {
	this.cardValue = cardValue;
}

public String getCardSuit() {
	return cardSuit;
}

public void setCardSuit(String cardSuit) {
	this.cardSuit = cardSuit;
}
public void describe() {
	System.out.println("Card Info: " + cardValue +" " +  cardSuit);
}
}
