package chasetest;

import static org.junit.Assert.assertEquals;
import static util.StringUtils.appendNewLine;

import org.junit.Before;
import org.junit.Test;

import chess.ChessBoard;
import chess.Position;
import piece.King;
import piece.Piece;
import piece.Queen;

public class ChaseBoardTest {
	ChessBoard board = new ChessBoard();
	final String blankRank = appendNewLine("........");

	@Before
	public void setUp() {
		board = new ChessBoard();
	}

	@Test
	public void boardTest() {

		board.initialize();
		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());
	}

	@Test
	public void getPieceCountTest() {

//		board.initialize();
//		assertEquals(1, board.getPieceCount(Piece.Color.WHITE, Piece.Type.KING));
//		assertEquals(2, board.getPieceCount(Piece.Color.WHITE, Piece.Type.ROOK));
//		assertEquals(8, board.getPieceCount(Piece.Color.BLACK, Piece.Type.PAWN));
//
//		assertEquals(Piece.createBlackRook(), board.findPiece("a8"));
//		assertEquals(Piece.createBlackRook(), board.findPiece("h8"));
//		assertEquals(Piece.createWhiteRook(), board.findPiece("a1"));
//		assertEquals(Piece.createWhiteRook(), board.findPiece("h1"));
	}

	@Test
	public void move() throws Exception {

		board.initializeEmpty();

		String position1 = "b5";
		String position2 = "b8";
		Piece piece = King.createBlack(new Position(position1));
		board.move("b5", piece);
		Piece piece2 = Queen.createWhite(new Position(position1));
		board.move("b8", piece2);

		assertEquals(piece, board.findPiece(position1));
		
		System.out.println(board.showBoard());
		
		board.move(position1, position2);
		
		System.out.println(board.showBoard());
		
		assertEquals(7, piece.getPosition().getY());
		assertEquals(1, piece.getPosition().getX());
	}

	@Test
	public void caculcatePoint() throws Exception {

//		board.initializeEmpty();
//
//		addPiece("b6", Piece.createBlackPawn());
//		addPiece("e6", Piece.createBlackQueen());
//		addPiece("b8", Piece.createBlackKing());
//		addPiece("c8", Piece.createBlackRook());
//
//		addPiece("f2", Piece.createWhitePawn());
//		addPiece("g2", Piece.createWhitePawn());
//		addPiece("e1", Piece.createWhiteRook());
//		addPiece("f1", Piece.createWhiteKing());
//
//		assertEquals(15.0, board.caculcatePoint(Piece.Color.BLACK), 0.01);
//		assertEquals(7.0, board.caculcatePoint(Piece.Color.WHITE), 0.01);
//
//		System.out.println(board.showBoard());
	}
//	@Test
//	public void calculatePawnExceptionPoint() {
//		board.initializeEmpty();
//
//		addPiece("b8", Piece.createBlackKing());
//		addPiece("c8", Piece.createBlackRook());
//		addPiece("a7", Piece.createBlackPawn());
//		addPiece("c7", Piece.createBlackPawn());
//		addPiece("d7", Piece.createBlackBishop());
//		addPiece("b6", Piece.createBlackPawn());
//		addPiece("e6", Piece.createBlackQueen());
//		
//		addPiece("f4", Piece.createWhiteKnight());
//		addPiece("g4", Piece.createWhiteQueen());
//		
//		addPiece("f3", Piece.createWhitePawn());
//		addPiece("h3", Piece.createWhitePawn());
//		addPiece("f2", Piece.createWhitePawn());
//		addPiece("g2", Piece.createWhitePawn());
//		
//		addPiece("e1", Piece.createWhiteRook());
//		addPiece("f1", Piece.createWhiteKing());
//
//		assertEquals(20.0, board.caculcatePoint(Piece.Color.BLACK), 0.01);
//		assertEquals(19.5, board.caculcatePoint(Piece.Color.WHITE), 0.01);
//	}
//	
//	private void addPiece(String position, Piece piece) {
//		board.move(position, piece);
//	}
//	
//	 @Test
//	    public void moveTest() throws Exception {
//	        board.initialize();
//
//	        String sourcePosition = "b2";
//	        String targetPosition = "b3";
//	        board.move(sourcePosition, targetPosition);
//	        assertEquals(Piece.createBlank(new Position(sourcePosition)), board.findPiece(sourcePosition));
//	        assertEquals(Piece.createWhitePawn(), board.findPiece(targetPosition));
//	        
//	    }
}
