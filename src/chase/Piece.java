package chase;

public class Piece {
	private Color color;
	private Type type;

	public enum Color {
		WHITE('w'), BLACK('b'), NOCOLOR('b');
		private char color;
		Color(char color){
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
		PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'), QUEEN('q'), KING('k'), NO_PIECE('.');
		private char representation;
		Type(char representation) {
			this.representation = representation;
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

	public Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
	}
	public static Piece createBlank() {
		return new Piece(Color.NOCOLOR, Type.NO_PIECE);
	}
	public static Piece createBlackPawn() {
		return new Piece(Color.BLACK, Type.PAWN);
	}

	public static Piece createWhitePawn() {
		return new Piece(Color.WHITE, Type.PAWN);
	}

	public static Piece createBlackRook() {
		return new Piece(Color.BLACK, Type.ROOK);
	}

	public static Piece createWhiteRook() {
		return new Piece(Color.WHITE, Type.ROOK);
	}

	public static Piece createBlackKnight() {
		return new Piece(Color.BLACK, Type.KNIGHT);
	}

	public static Piece createWhiteKnight() {
		return new Piece(Color.WHITE, Type.KNIGHT);
	}

	public static Piece createBlackBishop() {
		return new Piece(Color.BLACK, Type.BISHOP);
	}

	public static Piece createWhiteBishop() {
		return new Piece(Color.WHITE, Type.BISHOP);
	}

	public static Piece createBlackQueen() {
		return new Piece(Color.BLACK, Type.QUEEN);
	}

	public static Piece createWhiteQueen() {
		return new Piece(Color.WHITE, Type.QUEEN);
	}

	public static Piece createBlackKing() {
		return new Piece(Color.BLACK, Type.KING);
	}

	public static Piece createWhiteKing() {
		return new Piece(Color.WHITE, Type.KING);
	}


	public boolean isBlack() {
		return this.color.equals(Color.BLACK);
	}

	public boolean isWhite() {
		return this.color.equals(Color.WHITE);
	}

}
