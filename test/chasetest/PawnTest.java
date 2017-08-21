package chasetest;

import static org.junit.Assert.*;

import org.junit.Test;

import chase.Pawn;

public class PawnTest {
	@Test
	public void createTest() {
		Pawn pawn = Pawn.createWhite();
		assertEquals("white", pawn.getColor());
		Pawn pawn2 = Pawn.createBlack();
		assertEquals("black", pawn2.getColor());
	}
}
