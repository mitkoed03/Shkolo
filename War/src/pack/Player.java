package pack;

public class Player {
	private Card[] cards;
	public int length = 0;
	
	public Player() {
		cards = new Card[52];
		
		for(int c = 0; c < cards.length; c++) {
			cards[c] = null;
		}
	}
	
	public void give(Player p) {
		p.add(cards[0]);
		collapse();
	}
	
	public void add(Card c) {
		for(int cnt = 0; cnt < cards.length; cnt++) {
			if(cards[cnt] == null) {
				cards[cnt] = c;
				length++;
				break;
			}
		}
		
	}
	
	public Card get(int n) {
		return cards[n];
	}
	
	public void collapse() {
		for(int c = 0; c < cards.length - 1; c++) {
			if(cards[c] == null) {
				break;
			}
			cards[c] = cards[c+1];
			length--;
		}
	}

	public String toString() {
		String s = "";
		for(int c = 0; c < 52; c++) {
			if(cards[c] == null) {
				break;
			}
			s += cards[c].toString() + " ";
		}
		
		return s;
	}
}
