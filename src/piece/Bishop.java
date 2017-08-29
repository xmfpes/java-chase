package piece;

import chess.ChessBoard;
import chess.Position;

public class Bishop extends Piece{

	Bishop(Color color, Position position) {
        super(color, Type.BISHOP, position, Direction.diagonalDirection());
    }
    
    public static Bishop createWhite(Position position) {
        return new Bishop(Color.WHITE, position);
    }
    
    public static Bishop createBlack(Position position) {
        return new Bishop(Color.BLACK, position);
    }
    
    @Override
    public void calculatePossibilityPosition(ChessBoard board) {
	    	for(int i=0; i<this.moveDirection.size(); i++) {
	    		getMovePosition(board, this.getPosition(), this.moveDirection.get(i));
	    	}
    }
    
    @Override
    public void getMovePosition(ChessBoard board, Position position, Direction direction) {
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
    			getMovePosition(board, new Position(moveX, moveY), direction);
    		}
    		
    }

}
