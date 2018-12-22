package pieces;

import essentials.ChessPiece;
import essentials.MovePattern;

public class Queen extends ChessPiece{

	public Queen(int r, int c, boolean f) 
	{
		super(r, c, f, "Q", new MovePattern(new int[] {0,0,1,-1, 1,-1,1,-1}, new int[] {1,-1,0,0, 1,-1,-1,1}));
	}
}
