package pieces;


import essentials.ChessPiece;
import essentials.Board;

public class King extends ChessPiece{
	
	public King(int row, int column, boolean f) 
	{
		super(row, column, f, "K", null);
	}
	
	public boolean moveTo(int newRow, int newColumn, Board b, boolean commit) 
	{
		if(newRow < 0 || newColumn < 0 || newRow > 7 || newColumn > 7) 
		{
			return false;
		}
		
		int diffRow = newRow - this.row();
		int diffColumn = newColumn - this.column();
		
		//Normal
		if(Math.abs(diffRow) <= 1 && Math.abs(diffColumn) <= 1) 
		{
			if(isOccupied(newRow, newColumn, b) || isDangerous(newRow, newColumn, b)) 
			{
				return false;
			}
			else 
			{
				if(commit) 
				{
					this.setPosition(newRow, newColumn);
				}
				return true;
			}
		}
		
		//Castling
		if(diffRow == 0 && Math.abs(diffColumn) == 2 && this.isInit()) 
		{
			if(isDangerous(this.row(), this.column(), b) || isDangerous(newRow, newColumn, b) || isDangerous(newRow, newColumn - diffColumn/2, b) || isOccupied(newRow, newColumn, b) || isOccupied(newRow, newColumn - diffColumn/2 , b))
			{
				return false;
			}
			
			for(ChessPiece cp : b.getContents()) 
			{
				if(cp.color() == this.color() && cp instanceof Rook && cp.isInit() && cp.row() == this.row() && cp.column() == (diffColumn == 2 ? 7 : 0))
				{
					if(commit)
					{
						this.setPosition(newRow, newColumn);
							
						cp.setPosition(newRow, newColumn - diffColumn/2);
					}
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean isDangerous(int newRow, int newColumn, Board b) 
	{
		for(ChessPiece cp : b.getContents()) 
		{
			if(cp.color() != this.color() && cp.moveTo(newRow, newColumn, b.modified(this.color()), false) == true ) 
			{
				return true;
			}
		}
		return false;
	}

	public boolean isOccupied(int newRow, int newColumn, Board b) 
	{
		for(ChessPiece cp : b.getContents()) 
		{
			if(cp.color() == this.color() && cp.row() == newRow && cp.column() == newColumn) 
			{
				return true;
			}
		}
		return false;
	}

}