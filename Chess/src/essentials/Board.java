package essentials;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Board extends JPanel{
	ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();
	
	public Board() 
	{
		
	}
	
	public Board(ChessPiece... cp) 
	{
		for(ChessPiece c : cp) 
		{
			pieces.add(c);
		}
	}
	
	public ArrayList<ChessPiece> getContents() 
	{
		return pieces;
	}
	
	public ChessPiece get(int row, int column) 
	{
		for(ChessPiece c : pieces) 
		{
			if(c.row() == row && c.column() == column)
			{
				return c;
			}
		}
		return null;
	}
	
	public void remove(ChessPiece c) 
	{
		pieces.remove(c);
	}
	
	public void add(ChessPiece c) 
	{
		pieces.add(c);
	}

}
