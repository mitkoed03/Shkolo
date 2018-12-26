package pieces;

import essentials.Board;
import essentials.ChessPiece;
import essentials.MovePattern;

public class Knight extends ChessPiece{

	public Knight(int r, int c, boolean f) 
	{
		super(r, c, f, "H", new MovePattern(new int[] {2,1,-2,-1, 2,1,-2,-1}, new int[] {1,2,1,2, -1,-2,-1,-2}));
	}
	
	public boolean moveTo(int newRow, int newColumn, Board b, boolean commit) 
	{
		if(newRow < 0 || newRow > 7 || newColumn < 0 || newColumn > 7)
			return false;
		
		int i = this.getPatt().findAbsMatch(newRow - this.row() , newColumn - this.column());
		if(i != - 1) 
		{
			for(ChessPiece c : b.getContents()) 
			{
				if(c.row() == newRow && c.column() == newColumn && c.color() == this.color()) 
				{
					return false;
				}
			}
			
			if(commit) 
			{
				this.setPosition(newRow, newColumn);
				b.repaint();
			}
			return true;
		}
		return false;
	}
}
