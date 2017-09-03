package move;

import chess.ChessBoard;
import piece.Piece;

public interface MovingStrategy {
	public void setPossibilityPosition(ChessBoard board, Piece myPiece);
	public void setPossibilityPositions(ChessBoard board, Piece myPiece, int index);
}
