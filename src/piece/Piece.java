package piece;

import java.util.ArrayList;
import java.util.List;

import chess.ChessBoard;
import chess.Position;

public class Piece {
	private Color color;
	private Type type;
	private Position position;
	protected List<Position> possibilityPosition;
	protected List<Direction> moveDirection;

	public enum Color {
		WHITE('w'), BLACK('b'), NOCOLOR('b');
		private char color;

		Color(char color) {
			this.color = color;
		}

		public char getColor() {
			return color;
		}

		public void setColor(char color) {
			this.color = color;
		}

	}

	public enum Type {
		PAWN('p', 1.0), ROOK('r', 5.0), KNIGHT('n', 2.5), BISHOP('b', 3.0), QUEEN('q', 9.0), KING('k',
				0.0), NO_PIECE('.', 0.0);

		private char representation;
		private double defaultPoint;

		private Type(char representation, double defaultPoint) {
			this.representation = representation;
			this.defaultPoint = defaultPoint;
		}

		public double getDefaultPoint() {
			return defaultPoint;
		}

		public char getWhiteRepresentation() {
			return representation;
		}

		public char getBlackRepresentation() {
			return Character.toUpperCase(representation);
		}

		public void setRepresentation(char representation) {
			this.representation = representation;
		}

		public void setDefaultPoint(double defaultPoint) {
			this.defaultPoint = defaultPoint;
		}

	}

	public char getPieceType() {
		if (this.color == Color.WHITE) {
			return this.type.getWhiteRepresentation();
		}
		return this.type.getBlackRepresentation();
	}

	public void move(Piece target) {
		// verifyMovePosition(target);
		this.position = target.position;
	}

	public Direction verifyMovePosition(Piece target) {
		if (isSameTeam(target)) {
			throw new InvalidPositionException(target + " 위치는 이동할 수 없는 위치입니다.");
		}
		
		Direction direction = position.direction(target.position);
		
		if (!moveDirection.contains(direction)) {
			throw new InvalidPositionException(target + " 위치는 이동할 수 없는 위치입니다.");
		}

		return direction;
	}
	
	public void getLimitedDistancePiecePossibilityPosition(ChessBoard board) {
		for(int i=0; i<this.moveDirection.size(); i++) {
			getLimitedDistancePieceMovePosition(board, this.getPosition(), this.moveDirection.get(i));
		}
	}
	
	protected void getLimitedDistancePieceMovePosition(ChessBoard board, Position position, Direction direction) {
		int myX = position.getX();
		int myY = position.getY();
		
		int x = direction.getXDegree();
		int y = direction.getYDegree();
		
		int moveX = myX + x;
		int moveY = myY + y;
		
		if(!(moveX< 0 || moveY >= 8 || moveY < 0 || moveX >= 8) && !this.isSameTeam(board.findPiece(moveX, moveY))) {
			System.out.println("x : " + moveX + " y : " + moveY);
			this.possibilityPosition.add(new Position(moveX, moveY));
		}
	}
	
	public void getUnlimitedDistancePiecePossibilityPosition(ChessBoard board) {
	    	for(int i=0; i<this.moveDirection.size(); i++) {
	    		getUnlimitedDistancePieceMovePosition(board, this.getPosition(), this.moveDirection.get(i));
	    	}
    }
  
	protected void getUnlimitedDistancePieceMovePosition(ChessBoard board, Position position, Direction direction) {
    		int myX = position.getX();
    		int myY = position.getY();
    		
    		int x = direction.getXDegree();
    		int y = direction.getYDegree();
    		
    		int moveX = myX + x;
    		int moveY = myY + y;
    		
    		if(!(moveX< 0 || moveY >= 8 || moveY < 0 || moveX >= 8) && !this.isSameTeam(board.findPiece(moveX, moveY))) {
    			System.out.println("x : " + moveX + " y : " + moveY);
    			this.possibilityPosition.add(new Position(moveX, moveY));
    			if(!(board.findPiece(moveX, moveY).getType() == Piece.Type.NO_PIECE))
    				return;
    			getUnlimitedDistancePieceMovePosition(board, new Position(moveX, moveY), direction);
    		}
    		
    }
	
	protected boolean isSameTeam(Piece target) {
		if (isWhite() && target.isWhite()) {
			return true;
		}

		if (isBlack() && target.isBlack()) {
			return true;
		}

		return false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void calculatePossibilityPosition() {

	}

	public Piece(Color color, Type type, Position position) {
		this.color = color;
		this.type = type;
		this.position = position;
	}

	protected Piece(Color color, Type type, Position position, List<Direction> directions) {
		this.color = color;
		this.type = type;
		this.position = position;
		this.moveDirection = directions;
		this.possibilityPosition = new ArrayList<Position>();
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean isBlack() {
		return this.color.equals(Color.BLACK);
	}

	public boolean isWhite() {
		return this.color.equals(Color.WHITE);
	}
	
	public List<Position> getPossibilityPosition() {
		return possibilityPosition;
	}

	public void setPossibilityPosition(List<Position> possibilityPosition) {
		this.possibilityPosition = possibilityPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
