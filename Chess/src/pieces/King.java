package pieces;

import java.awt.Color;

import essentials.ChessPiece;
import essentials.MovePattern;
import essentials.Board;

public class King extends ChessPiece{
	
	public King(int row, int column, boolean f) {
		super(row, column, f, "K", null);
	}
	
	public boolean moveTo(int newRow, int newColumn, Board b, boolean commit) {
		int row = this.row();
		int column = this.column();
		
		if(newRow < 0 || newColumn < 0 || newRow > 7 || newColumn > 7){
			System.out.println("f1");
			return false;
		}
		
		//Normalno
		if(Math.abs(newRow - row) == 1 && Math.abs(newColumn - column) == 1) {
			if(isOccupied(newRow, newColumn, b) || isDangerous(newRow, newColumn, b)) {
				return false;
			}else {
				if(commit) {
					this.setPosition(newRow, newColumn);
					this.move();
				}
				return true;
			}
		}
		
		//Golqma Rokada
		if(row == newRow && newColumn - column == -2 && this.isInit()) {
			if(isDangerous(newRow, newColumn, b) || isDangerous(newRow, newColumn + 1, b) || isOccupied(newRow, newColumn, b) || isOccupied(newRow, newColumn + 1, b)) {
				return false;
			}
			
			for(ChessPiece cp : b.getContents()) {
				if(cp != null) {
					if(cp.row() == row && cp.column() == 0 && cp.color() == this.color() && cp instanceof Rook && cp.isInit() == false) {
						if(commit) {
							this.setPosition(newRow, newColumn);
							this.move();
							
							cp.setPosition(newRow, newColumn + 1);
							cp.move();
						}
						return true;
					}
				}
			}
		}
		
		//Malka Rokada
		if(row == newRow && newColumn - column == 2 && this.isInit() == false) {
			if(isDangerous(newRow, newColumn, b) || isDangerous(newRow, newColumn - 1, b) || isOccupied(newRow, newColumn, b) || isOccupied(newRow, newColumn - 1, b)) {
				return false;
			}
			
			for(ChessPiece cp : b.getContents()) {
				if(cp != null) {
					if(cp.row() == row && cp.column() == 7 && cp.color() == this.color() && cp instanceof Rook && cp.isInit() == false) {
						if(commit) {
							this.setPosition(newRow, newColumn);
							this.move();
							
							cp.setPosition(newRow, newColumn - 1);
							cp.move();
						}
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean isDangerous(int newRow, int newColumn, Board b) {
		for(ChessPiece cp : b.getContents()) {
			if(cp != null) {
				if(cp.moveTo(newRow, newColumn, b, false) == true) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isOccupied(int newRow, int newColumn, Board b) {
		for(ChessPiece cp : b.getContents()) {
			if(cp != null) {
				if(cp.row() == newRow && cp.column() == newColumn && cp.color() == this.color()) {
					return true;
				}
			}
		}
		
		return false;
	}
}