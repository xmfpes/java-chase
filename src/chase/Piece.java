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
	
	public char getPieceType() {
		if(this.color == Color.WHITE) {
			return this.type.getWhiteRepresentation();
		}
		return this.type.getBlackRepresentation();
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
	private static Piece createWhite(Type type) {
		return new Piece(Color.WHITE, type);
	}
	private static Piece createBlack(Type type) {
		return new Piece(Color.BLACK, type);
	}
	public static Piece createBlank() {
		return new Piece(Color.NOCOLOR, Type.NO_PIECE);
	}
	public static Piece createBlackPawn() {
		return createBlack(Type.PAWN);
	}

	public static Piece createWhitePawn() {
		return createWhite(Type.PAWN);
	}

	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}

	public static Piece createWhiteRook() {
		return createWhite(Type.ROOK);
	}

	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
	}

	public static Piece createWhiteKnight() {
		return createWhite(Type.KNIGHT);
	}

	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}

	public static Piece createWhiteBishop() {
		return createWhite(Type.BISHOP);
	}

	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}

	public static Piece createWhiteQueen() {
		return createWhite(Type.QUEEN);
	}

	public static Piece createBlackKing() {
		return createBlack(Type.KING);
	}

	public static Piece createWhiteKing() {
		return createWhite(Type.KING);
	}


	public boolean isBlack() {
		return this.color.equals(Color.BLACK);
	}

	public boolean isWhite() {
		return this.color.equals(Color.WHITE);
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
