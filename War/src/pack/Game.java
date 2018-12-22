package pack;

import java.util.Scanner;

public class Game {
	private static Player p[];

	public static void main (String args[]) {
		setup();
		play();
	}
	
	public static void setup() {
		Deck deck = new Deck();
		deck.shuffle();
		deck.cut();
		
		p = new Player[]{new Player(), new Player() ,new Player() , new Player()};
		
		for(int c = 0; c < 52; c++) {
			p[c%4].add(deck.get(c));
		}
	}

	public static void play() {
		for(int c = 0; c < 4; c++) {
			if(p[c].length == 52) {
				System.out.println("Player " + (c + 1) + " wins.");
			}
		}
		
		Card[] turn = new Card[4];
		turn[0] = (p[0].length == 0 ? new Card(-1,0) : p[0].get(0));
		turn[1] = (p[1].length == 0 ? new Card(-1,0) : p[1].get(0));
		turn[2] = (p[2].length == 0 ? new Card(-1,0) : p[2].get(0));
		turn[3] = (p[3].length == 0 ? new Card(-1,0) : p[3].get(0));
		
		System.out.printf("\nP1:  %s  P2:  %s  P3:  %s  P4:  %s", turn[0], turn[1], turn[2], turn[3]);
		
		int i = 0;
		for(int c = 1; c < 4; c++) {
			i = (turn[i].getPower() > turn[c].getPower() ? i : c);
		}
		
		int n = 4;
		for(int c = 0; c < 4; c++) {
			if(turn[c].getPower() != turn[i].getPower()) {
				turn[c] = new Card(-1, 0);
				n--;
			}
		}
		
		if(n == 1) {
			for(int c = 0; c < 4; c++) {
				if(p[c].length != 0) {
					p[c].give(p[i]);
				}
			}
			
			System.out.println("\nWinner: Player " + (i + 1));
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			if(sc.nextLine() != "/end") {
				play();
			}
			else {
				System.out.println();
			}
			sc.close();
		}
		else {
			System.out.println("\n----------------- WAR -----------------");
			war(turn);
		}
		
	}
	
	public static void war(Card[] turn) {
		for(int cnt = 0; cnt < 4; cnt++) { 
			System.out.println();
			for(int c = 0; c < 4; c++) {
				if(turn[c].getPower() != -1) {
					switch(cnt) {
					case 0:
						System.out.printf("P%s ", (c + 1));
						break;
					case 1:
						System.out.print((p[c].get(1) == null ? "|X|" : p[c].get(1)));
						break;
					case 2:
						System.out.print((p[c].get(2) == null ? "|X|" : p[c].get(2)));
						break;
					case 3:
						System.out.print((p[c].get(3) == null ? "|X|" : p[c].get(3)));
						break;
					}
				}
			}
		}
		
		for(int c = 0; c < 4; c++) {
			if(turn[c].getPower() != -1) {
				turn[c] = p[c].get((p.length >= 3 ? 3 : p.length));
			}
		}
		
		int i = 0;
		for(int c = 1; c < 4; c++) {
			i = (turn[i].getPower() > turn[c].getPower() ? i : c);
		}
		
		int n = 0;
		for(Card c : turn) {
			if(c.getPower() == turn[i].getPower()) {
				n++;
			}
		}
		
		if(n == 1) {
			for(int c = 0; c < 4; c++) {
				if(turn[c].getPower() == -1) {
					if(p[c].length != 0) {
						p[c].give(p[i]);
					}
				}
				else {
					for(int cnt = 0; cnt < 4; cnt++) {
						if(p[c].length != 0) {
							p[c].give(p[i]);
						}
					}
				}
			}
			
			System.out.println("");
			System.out.printf("Player %s wins!", (i + 1));
		} else {
			for(int c = 0; c < 4; c++) {
				p[c].give(p[c]);
			}
			System.out.println("Stalemate");
		}
		
		play();
	}
}
