package piece;

import java.util.List;

import chess.ChessBoard;
import chess.Position;
import piece.Piece.Color;
import piece.Piece.Type;

public class Pawn extends Piece {

	private boolean firstMove = false;

	private Pawn(Color color, Position position, List<Direction> direction) {
		super(color, Type.PAWN, position, Direction.blackPawnDirection());
	}

	public static Pawn createWhite(Position position) {
		return new Pawn(Color.WHITE, position, Direction.whitePawnDirection());
	}

	public static Pawn createBlack(Position position) {
		return new Pawn(Color.BLACK, position, Direction.blackPawnDirection());
	}
	
	@Override
	public void getLimitedDistancePiecePossibilityPosition(ChessBoard board) {
		for(int i=0; i<this.moveDirection.size(); i++) {
			getLimitedDistancePieceMovePosition(board, this.getPosition(), this.moveDirection.get(i));
		}
	}
	
	@Override
	protected void getLimitedDistancePieceMovePosition(ChessBoard board, Position position, Direction direction) {
		int x = direction.getXDegree();
		int y = direction.getYDegree();
		
		if(firstMove == false && direction == Direction.SOUTH || direction == Direction.NORTH) {
			y += direction.getYDegree();
		}
		
		int myX = position.getX();
		int myY = position.getY();
		
		int moveX = myX + x;
		int moveY = myY + y;
		
		if(!(moveX< 0 || moveY >= 8 || moveY < 0 || moveX >= 8) && !this.isSameTeam(board.findPiece(moveX, moveY))) {
			System.out.println("x : " + moveX + " y : " + moveY);
			this.possibilityPosition.add(new Position(moveX, moveY));
		}
	}

}
