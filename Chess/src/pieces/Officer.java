package pieces;

import essentials.ChessPiece;
import essentials.MovePattern;

public class Officer extends ChessPiece {
	
	public Officer(int r, int c, boolean f) 
	{
		super(r, c, f, "O", new MovePattern(new int[] {1,-1,1,-1}, new int[] {1,-1,-1,1}));
	}
}
