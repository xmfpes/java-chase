package chasetest;

import static org.junit.Assert.assertEquals;
import static util.StringUtils.appendNewLine;

import org.junit.Before;
import org.junit.Test;

import chase.ChaseBoard;
import chase.Piece;

public class ChaseBoardTest {
	ChaseBoard board = new ChaseBoard();
	final String blankRank = appendNewLine("........");

	@Before
	public void setUp() {
		board = new ChaseBoard();
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

//		board.initializeEmpty();
//
//		String position = "b5";
//		Piece piece = Piece.createBlackRook();
//		board.move(position, piece);
//
//		assertEquals(piece, board.findPiece(position));
//		System.out.println(board.showBoard());
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
	@Test
	public void calculatePawnExceptionPoint() {
		board.initializeEmpty();

		addPiece("b8", Piece.createBlackKing());
		addPiece("c8", Piece.createBlackRook());
		addPiece("a7", Piece.createBlackPawn());
		addPiece("c7", Piece.createBlackPawn());
		addPiece("d7", Piece.createBlackBishop());
		addPiece("b6", Piece.createBlackPawn());
		addPiece("e6", Piece.createBlackQueen());
		
		addPiece("f4", Piece.createWhiteKnight());
		addPiece("g4", Piece.createWhiteQueen());
		
		addPiece("f3", Piece.createWhitePawn());
		addPiece("h3", Piece.createWhitePawn());
		addPiece("f2", Piece.createWhitePawn());
		addPiece("g2", Piece.createWhitePawn());
		
		addPiece("e1", Piece.createWhiteRook());
		addPiece("f1", Piece.createWhiteKing());

		assertEquals(20.0, board.caculcatePoint(Piece.Color.BLACK), 0.01);
		assertEquals(19.5, board.caculcatePoint(Piece.Color.WHITE), 0.01);
	}
	private void addPiece(String position, Piece piece) {
		board.move(position, piece);
	}
}
