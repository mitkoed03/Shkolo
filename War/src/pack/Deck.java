package pack;

import java.util.Random;

public class Deck {
	
	public Card[] cards;
	
	public Deck() {
		cards = new Card[52];
		for(int c = 0; c < 52; c++) {
			cards[c] = new Card(c%13, c/13);
		}
	}
	
	public void shuffle() {
		Random r = new Random();
		for(int i = 0; i < cards.length; i++) {
			int k = r.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[k];
			cards[k] = temp;
		}
	}
	
	public void cut() {
		Random r = new Random();
		int m = r.nextInt(2) + 10;
		
		Card[] d = new Card[52];
		for(int c = 0; c < cards.length; c++) {
			if(c >= m) {
				d[c - m] = cards[c];
			}
			else {
				d[c + (cards.length - m)] = cards[c]; 
			}
		}
		
		cards = d;
	}
	
	public Card get(int n) {
		return cards[n];
	}
	
	public String toString() {
		String desc = "";
		for(Card c : cards) {
			desc += c.toString() + " ";
		}
		return desc;
	}
	
}
