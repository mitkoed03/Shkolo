package essentials;

import java.util.ArrayList;

import javax.swing.JPanel;

import pieces.*;

@SuppressWarnings("serial")
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
	
	public Board(Board b, boolean f) {
		ArrayList<ChessPiece> copy = new ArrayList<ChessPiece>();
		copy.addAll(b.getContents());
		
		for(int c = 0; c < copy.size(); c++) {
			if(copy.get(c) instanceof King && copy.get(c).color() == f) {
				copy.remove(c);
			}
		}
		
		pieces = copy;
	}
	
	public Board modified(boolean f) {
		return new Board(this, f);
	}
	
	public ArrayList<ChessPiece> getContents() 
	{
		ArrayList<ChessPiece> copy = new ArrayList<ChessPiece>();
		copy.addAll(pieces);
		return copy;
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
	
	public void remove(int row, int column, boolean t) 
	{
		for(ChessPiece cp : pieces) 
		{
			if(cp.color() == t && cp.row() == row && cp.column() == column) 
			{
				pieces.remove(cp);
				break;
			}
		}
	}
	
	public void add(ChessPiece c) 
	{
		pieces.add(c);
	}

}
