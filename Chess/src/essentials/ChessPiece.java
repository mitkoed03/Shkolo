package essentials;

abstract public class ChessPiece {
	private int row, column;
	private boolean color, init = true;
	private String desc;
	private MovePattern m;

	public ChessPiece(int r, int c, boolean f, String d, MovePattern mp) 
	{
		row = r;
		column = c;
		color = f;
		desc = d;
		m = mp;
	}
	
	public boolean moveTo(int newRow, int newColumn, Board b, boolean commit)
	{
		if(newRow < 0 || newRow > 7 || newColumn < 0 || newColumn > 7)
			return false;
		
		int i = this.getPatt().findMatch(newRow - row , newColumn - column);
		if(i != -1) 
		{
			int row = newRow;
			int column = newColumn;
			
			for(ChessPiece c : b.getContents()) 
			{
				if(c.row() == row && c.column() == column && c.color() == this.color()) 
				{
					return false;
				}
			}
			
			row -= this.getPatt().get()[i][0];
			column -= this.getPatt().get()[i][1];
			
			while(row != this.row() && column != this.row()) 
			{
				for(ChessPiece c : b.getContents()) 
				{
					if(c.row() == row && c.column() == column) 
					{
						return false;
					}
				}
				
				row -= this.getPatt().get()[i][0];
				column -= this.getPatt().get()[i][1];
			}
			
			if(commit) {
				this.setPosition(newRow, newColumn);
			}
			return true;
		}
		
		return false;
	}
	
	public void setPosition(int r, int c)
	{
		row = r;
		column = c;
	}
	
	public int row() 
	{
		return row;
	}
	
	public int column()
	{
		return column;
	}
	
	public boolean color() 
	{
		return color;
	}
	
	public boolean isInit() 
	{
		return init;
	}

	public void move() {
		init = false;
	}
	
	public MovePattern getPatt() 
	{
		return m;
	}
	
	public String toString() 
	{
		return desc;
	}

}