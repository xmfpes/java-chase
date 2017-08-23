package chasetest;

import static org.junit.Assert.assertEquals;
import static util.StringUtils.appendNewLine;

import org.junit.Test;

import chase.ChaseBoard;
import chase.Piece;

public class ChaseBoardTest {
	final String blankRank = appendNewLine("........");
	@Test
	public void boardTest() {
		ChaseBoard board = new ChaseBoard();
		
		board.initialize();
		assertEquals(
	            appendNewLine("RNBQKBNR") +
	            appendNewLine("PPPPPPPP") +
	            blankRank + blankRank + blankRank + blankRank +
	            appendNewLine("pppppppp") +
	            appendNewLine("rnbqkbnr"),
	            board.showBoard());   
	}
	@Test
	public void getPieceCountTest() {
		ChaseBoard board = new ChaseBoard();
		board.initialize();
		assertEquals(1, board.getPieceCount(Piece.Color.WHITE, Piece.Type.KING));
		assertEquals(2, board.getPieceCount(Piece.Color.WHITE, Piece.Type.ROOK));
		assertEquals(8, board.getPieceCount(Piece.Color.BLACK, Piece.Type.PAWN));
		
		assertEquals(Piece.createBlackRook(), board.findPiece("a8"));
        assertEquals(Piece.createBlackRook(), board.findPiece("h8"));
        assertEquals(Piece.createWhiteRook(), board.findPiece("a1"));
        assertEquals(Piece.createWhiteRook(), board.findPiece("h1"));
	}
	@Test
    public void move() throws Exception {
		ChaseBoard board = new ChaseBoard();
        board.initializeEmpty();

        String position = "b5";
        Piece piece = Piece.createBlackRook();
        board.move(position, piece);

        assertEquals(piece, board.findPiece(position));
        System.out.println(board.showBoard());
    }
}
