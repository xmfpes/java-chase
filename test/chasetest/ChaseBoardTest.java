package chasetest;

import static org.junit.Assert.assertEquals;
import static util.StringUtils.appendNewLine;

import org.junit.Test;

import chase.ChaseBoard;

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
		assertEquals(32, board.pieceCount());
	}
}
