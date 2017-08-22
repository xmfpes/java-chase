package chasetest;

import static org.junit.Assert.*;

import org.junit.Test;

import chase.ChaseBoard;
import chase.Piece;

public class PawnTest {
	@Test
	public void createTest() {
		
		ChaseBoard board = new ChaseBoard();
//		board.addWhite(white);
//		assertEquals(1, board.getWhiteSize());
//		board.addBlack(black);
//		assertEquals(1, board.getBlackSize());
//		assertEquals(black, board.findBlackPawn(0));
//		assertEquals(white, board.findWhitePawn(0));
		board.initialize();
		assertEquals("pppppppp", board.getWhitePawnsResult().toString());
	    assertEquals("PPPPPPPP", board.getBlackPawnsResult().toString());
	    Piece piece = Piece.createBlackBishop();
	}
}
