package pack;

public class Card {
	private int pow;
	private int clr;
	
	public Card(int a, int b) {
		pow = a;
		clr = b;
	}
	
	public int getPower() {
		return pow;
	}
	
	public int getColor() {
		return clr;
	}

	public String toString() {
		String s = "|";
		
		switch(pow + 2) {
			case 11:
				s += "J";
				break;
			case 12:
				s += "Q";
				break;
			case 13:
				s += "K";
				break;
			case 14:
				s += "A";
				break;
			default:
				s += pow + 2;
				break;
		}
		
		switch(clr) {
			case 0:
				s += "C|";
				break;
			case 1:
				s += "D|";
				break;
			case 2:
				s += "H|";
				break;
			case 3:
				s += "S|";
				break;
			default:
				break;
		}
		
		if(pow == -1) {
			s = "|X|";
		}
		
		return s;
	}

}
