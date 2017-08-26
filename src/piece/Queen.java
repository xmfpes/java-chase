package piece;

import chess.Position;

public class Queen extends Piece{

	public Queen(Color color, Position position) {
		super(color, Piece.Type.QUEEN, position, Direction.everyDirection());
		// TODO Auto-generated constructor stub
	}
	
	public static Queen createWhite(Position position) {
        return new Queen(Color.WHITE, position);
    }
    
    public static Queen createBlack(Position position) {
        return new Queen(Color.BLACK, position);
    }
}
