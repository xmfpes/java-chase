package chase;

public class Piece {
	private String color;
	private String piece;
	public enum Color {
        WHITE, BLACK, NOCOLOR;
    }

    public enum Type {
      PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE;
    }
	
	public Piece(String piece, String color) {
		this.piece = piece;
		this.color = color;
	}
	public static Piece createBlackPawn() {
		return new Piece("P", "black");
	}
	public static Piece createWhitePawn() {
		return new Piece("p", "white");
	}
	public static Piece createBlackRook() {
		return new Piece("R", "black");
	}
	public static Piece createWhiteRook() {
		return new Piece("R", "white");
	}
	public static Piece createBlackKnight() {
		return new Piece("N", "black");
	}
	public static Piece createWhiteKnight() {
		return new Piece("n", "white");
	}
	public static Piece createBlackBishop() {
		return new Piece("B", "black");
	}
	public static Piece createWhiteBishop() {
		return new Piece("b", "white");
	}
	public static Piece createBlackQueen() {
		return new Piece("Q", "black");
	}
	public static Piece createWhiteQueen() {
		return new Piece("q", "white");
	}
	public static Piece createBlackKing() {
		return new Piece("K", "black");
	}
	public static Piece createWhiteKing() {
		return new Piece("k", "white");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
