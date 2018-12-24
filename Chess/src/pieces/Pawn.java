package pieces;

import essentials.Board;
import essentials.ChessPiece;

public class Pawn extends ChessPiece {

	public Pawn(int r, int c, boolean f) {
		super(r, c, f, "P", null);
	}

	public boolean moveTo(int newRow, int newColumn, Board b, boolean commit) {
		if(newRow < 0 || newRow > 7 || newColumn < 0 || newColumn > 7)
			return false;
		
		int diffRow = newRow - this.row();
		int diffColumn = newColumn - this.column();
		
		if(diffRow == (this.color() ? -1 : 1) && diffColumn == 0) 
		{
			for(ChessPiece c : b.getContents()) 
			{
				if(c.row() == newRow && c.column() == newColumn)
				{
					return false;
				}
			}
			
			if(commit)
				this.setPosition(newRow, newColumn);
			return true;
		}
		
		if(this.isInit() && diffRow == (this.color() ? -2 : 2) && diffColumn == 0) 
		{
			for(ChessPiece c : b.getContents()) 
			{
				if(c.row() == newRow && c.column() == newColumn)
				{
					return false;
				}
			}
			
			if(commit)
				this.setPosition(newRow, newColumn);
			return true;
		}
		
		if(diffRow == (this.color() ? -1 : 1) && Math.abs(diffColumn) == 1) 
		{
			for(ChessPiece c : b.getContents()) 
			{
				if(c.color() != this.color() && c .row() == newRow && c.column() == newColumn)
				{
					if(commit)
						this.setPosition(newRow, newColumn);
					return true;
				}
			}
			
			return false;
		}
		
		return false;
	}
}
