package chase;

public class Position {
	private int row;
	private int col;
	
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

}
