package move;

import java.awt.Point;
import java.util.List;

import chess.ChessBoard;
import piece.Direction;
import piece.Piece;
import piece.Position;

public class BaseMovingStrategy {
	private MovingStrategy movingStrategy;
	
	public boolean isInBoard(int x, int y) {
		if (x < 0 || y >= 8 || y < 0 || x >= 8) {
			return false;
		}
		return true;
	}

	public void BasicMovingStrategy(ChessBoard board, Piece myPiece, int index) {
		// TODO Auto-generated method stub
		List<Position> possibilityPosition = myPiece.getPossibilityPosition();
		Position position = myPiece.getPosition();
		Direction direction = myPiece.getMoveDirection().get(index);
		
		Point myP = new Point(position.getX(), position.getY());
		Point dirP = new Point(direction.getXDegree(), direction.getYDegree());
		Point moveP = new Point((int)(myP.getX() + dirP.getX()), (int)(myP.getY() + dirP.getY()));
		
	}
}
