package piece;

import java.util.List;

import chess.Position;
import move.Direction;
import move.PawnMovingStrategy;

public class Pawn extends Piece {

	private boolean firstMove = true;

	private Pawn(Color color, Position position, List<Direction> direction) {
		super(color, Type.PAWN, position, Direction.blackPawnDirection(), new PawnMovingStrategy());
	}

	public static Pawn createWhite(Position position) {
		return new Pawn(Color.WHITE, position, Direction.whitePawnDirection());
	}

	public static Pawn createBlack(Position position) {
		return new Pawn(Color.BLACK, position, Direction.blackPawnDirection());
	}

	public boolean isFirstMove() {
		return firstMove;
	}

	public void setFirstMove(boolean firstMove) {
		this.firstMove = firstMove;
	}
	
	
}
