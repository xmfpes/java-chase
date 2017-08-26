package chasetest;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.ChessBoard;
import piece.Piece;

import static util.StringUtils.appendNewLine;

public class PawnTest {
	final String blankRank = appendNewLine("........");
	@Test
	public void createTest() {
		
		ChessBoard board = new ChessBoard();
//		board.addWhite(white);
//		assertEquals(1, board.getWhiteSize());
//		board.addBlack(black);
//		assertEquals(1, board.getBlackSize());
//		assertEquals(black, board.findBlackPawn(0));
//		assertEquals(white, board.findWhitePawn(0));
		
//		assertEquals("pppppppp", board.getWhitePawnsResult().toString());
//	    assertEquals("PPPPPPPP", board.getBlackPawnsResult().toString());
	    board.initialize();
        assertEquals(32, board.getAllPieceCount());
       
         
	}
}
