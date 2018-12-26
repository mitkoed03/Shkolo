package essentials;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import pieces.*;

@SuppressWarnings("serial")
public class Board extends JPanel{
	ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();
	
	public Board() 
	{
		boolean t = true;
		for(int c = 0; c < 2; c++)
		{
			t = !t;
			
			pieces.add(new Rook(c*7, 0, t));
			pieces.add(new Rook(c*7, 7, t));
			pieces.add(new Knight(c*7, 1, t));
			pieces.add(new Knight(c*7, 6, t));
			pieces.add(new Officer(c*7, 2, t));
			pieces.add(new Officer(c*7, 5, t));
			pieces.add(new Queen(c*7, 3, t));
			pieces.add(new King(c*7, 4, t));
			
			for(int i = 0; i < 8; i++) {
				pieces.add(new Pawn(Math.abs(c*7 - 1), i, t));
			}
		}
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

	
	public void paintComponent(Graphics g)
	{
		int vDiff = this.getHeight()/8;
		
		g.setColor(Color.DARK_GRAY);
		for(int cnt = 0; cnt < 64; cnt++)
		{
			if(cnt%8 != 0) 
			{
				if(g.getColor() == Color.DARK_GRAY)
					g.setColor(Color.WHITE);
				else
					g.setColor(Color.DARK_GRAY);
			}
			
			g.fillRect(cnt%8*vDiff, cnt/8*vDiff, vDiff, vDiff);
		}
		
		for(ChessPiece c : pieces)
		{
			ImageIcon icon = new ImageIcon(this.getClass().getResource(String.format("/res/%s%s.png", c.toString(), (c.color() ? "W" : "B"))));
			g.drawImage(icon.getImage(), c.column()*vDiff, c.row()*vDiff, null);
		}
	}
}
