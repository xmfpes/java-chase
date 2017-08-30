package chess;

import piece.Direction;
import piece.InvalidPositionException;

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Position(String position) {
		if(position == null) {
			throw new InvalidPositionException("위치 값이 null이 될 수 없습니다.");
		}
		if(position.length() != 2) {
			throw new InvalidPositionException("값이 길이가 잘못되었습니다.");
		}
		this.x = position.charAt(0) - 'a';
		this.y = Character.getNumericValue(position.charAt(1)) - 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Direction direction(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

}
