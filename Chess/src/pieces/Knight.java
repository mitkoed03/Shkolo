package pieces;

import essentials.ChessPiece;
import essentials.MovePattern;

public class Knight extends ChessPiece{

	public Knight(int r, int c, boolean f) 
	{
		super(r, c, f, "K", new MovePattern(new int[] {0,0,1,-1, 1,-1,1,-1}, new int[] {1,-1,0,0, 1,-1,-1,1}));
	}
}
