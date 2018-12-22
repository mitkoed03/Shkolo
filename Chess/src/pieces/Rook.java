package pieces;

import essentials.ChessPiece;
import essentials.MovePattern;

public class Rook extends ChessPiece {
	
	public Rook(int r, int c, boolean f) 
	{
		super(r, c, f, "T", new MovePattern(new int[] {0,0,1,-1}, new int[] {1,-1,0,0}));
	}

}
