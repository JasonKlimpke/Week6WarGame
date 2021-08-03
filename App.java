package warGame;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
				
		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.setName("A");
		p2.setName("B");
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				p1.draw(deck);
			}else{
				p2.draw(deck);
			}
//			System.out.println(i);
		}
		System.out.println("Lets Play a Game of War");
		System.out.println("*.) This is a 2 Player Game");
		System.out.println("*.) Each Player is Delt 26 Cards");
		System.out.println("*.) The Player Delt the Higher Card Wins the Hand and a Point");
		System.out.println("*.) The Player With the Most Points When All Cards Have Been Played is the Winner");
		System.out.println("*****NEW GAME*****");
		for(int i = 0; i < 26; i++) {
		int p1Card = p1.flip().getCardValue();
		int p2Card = p2.flip().getCardValue();
		System.out.println("Player 1's Card: " + p1Card);
		System.out.println("Player 2's Card: " + p2Card);
			if (p1Card > p2Card) {
				p1.incrementScore();
				System.out.println("Player 1 Wins this hand");
			}else if(p2Card > p1Card) {
				p2.incrementScore();
				System.out.println("Player 2 Wins this hand");
			}else {
				System.out.println("Tie hand");
			}
			System.out.println("*** Player 1's score: " + p1.getScore());
			System.out.println("**** Player 2's score: " + p2.getScore());
		}
		if(p1.getScore() > p2.getScore()) {
			System.out.println("**GAME OVER** Player 1 wins the Game");
			}else if (p2.getScore() > p1.getScore()){
				System.out.println("**GAME OVER** Player 2 wins the Game");
			}else {
				System.out.println("**GAME OVER** Tie Game");
			}
	}
//			for(int i = 0; i < 26; i++) {
//			int p1Card = p1.flip().getCardValue();
//			int p2Card = p2.flip().getCardValue();
//			System.out.println("Player 1's Card: " + p1Card);
//			System.out.println("Player 2's Card: " + p2Card);
//				if (p1Card > p2Card) {
//					p1.incrementScore();
//					System.out.println("Player 1 wins this hand");
//				}else if(p2Card > p1Card) {
//					p2.incrementScore();
//					System.out.println("Player 2 wins this hand");
//				}else {
//					System.out.println("Tie game");
//				}
//				System.out.println("Player 1's score: " + p1.getScore());
//				System.out.println("Player 2's score: " + p2.getScore());	
//	}
	
}


