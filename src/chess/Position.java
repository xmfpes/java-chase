package chess;

import piece.Direction;

public class Position {
	private int row;
	private int col;
	
	public Position(int x, int y) {
		this.col = x;
		this.row = y;
	}
	
	public Position(String position) {
		this.col = position.charAt(0) - 'a';
		this.row = Character.getNumericValue(position.charAt(1)) - 1;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Direction direction(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

}
