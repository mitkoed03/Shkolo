package essentials;

import pieces.*;

public class Execute  {
	
	public static void main(String args[]) 
	{
		Pawn p = new Pawn(6,3, true);
		Rook r = new Rook(5,2, false);
		
		Board b = new Board(p, r);
		
		visualize(p, b);
	}
	
	public static void visualize(ChessPiece c1, Board b) {
		for(int c = 0; c < 8; c++) 
		{
			for(int i = 0; i < 8; i++) 
			{
				if(c1.moveTo(c, i, b, false)) 
				{
					boolean match = false;
					for(ChessPiece cp : b.getContents()) {
						if(cp.row() == c && cp.column() == i) {
							System.out.printf("|%s", cp.toString().toLowerCase());
							match = true;
							break;
						}
					}
					
					if(!match)
						System.out.print("|X");
				}
				else
				{
					boolean match = false;
					for(ChessPiece cp : b.getContents()) {
						if(cp.row() == c && cp.column() == i) {
							System.out.printf("|%s", cp.toString());
							match = true;
							break;
						}
					}
					
					if(!match)
						System.out.print("| ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("=================");
	}
}
