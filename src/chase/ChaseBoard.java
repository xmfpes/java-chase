package chase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import chase.Piece.Color;
import util.StringUtils;

public class ChaseBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String BLANK = "........";
	private List<Rank> chaseBoard;
	private PawnCheck pawnCheckList;
	
	
	public ChaseBoard() {
		chaseBoard = new ArrayList<Rank>();
		pawnCheckList = new PawnCheck();
	}
	
	public void initialize() {
		chaseBoard.add(Rank.createWhitePieceRank());
		chaseBoard.add(Rank.createWhitePawnRank());
		for(int i=0; i<4; i++) {
			chaseBoard.add(Rank.createBlankRank());
		}
		chaseBoard.add(Rank.createBlackPawnRank());
		chaseBoard.add(Rank.createBlackPieceRank());
	}
	
	public void initializeEmpty() {
		List<Piece> blankList = new ArrayList<Piece>();
		for(int i=0; i<8; i++) {
			chaseBoard.add(Rank.createBlankRank());
		}
	}
	
	public String showBoard() {
		StringBuilder st = new StringBuilder();
		for(int i=chaseBoard.size() - 1; i>=0; i--) {
			for(int j=0; j<chaseBoard.get(i).getRankSize(); j++) {
				st.append(chaseBoard.get(i).getIndexPiece(j).getPieceType());
			}
			st.append(StringUtils.NEWLINE);
		}
		
		return st.toString();
	}
	public int getAllPieceCount() {
		return chaseBoard.size() * 8;
	}
	
	public int getPieceCount(Piece.Color color, Piece.Type type) {
		int specificPieceCount = 0;
		for(int i=0; i<chaseBoard.size(); i++) {
			specificPieceCount += chaseBoard.get(i).findPieceCountInRank(color, type);
		}
		return specificPieceCount;
	}
	
	public Piece findPiece(String position) {
		int col = position.charAt(0) - 'a';
		int row = Character.getNumericValue(position.charAt(1)) - 1;
	
		return chaseBoard.get(row).findPiece(col);
	}
	
	public void move(String position, Piece piece) {
		Position parsedPosition = new Position(position);
		chaseBoard.get(parsedPosition.getRow()).setPiece(parsedPosition.getCol(), piece);
	}
	
	public void move(String beforeposition, String afterPosition) {
		Position parsedBeforePosition = new Position(beforeposition);
		Piece piece = chaseBoard.get(parsedBeforePosition.getRow()).findPiece(parsedBeforePosition.getCol());
		
		move(afterPosition, piece);
		move(beforeposition, Piece.createBlank());
	}
	
	public double caculcatePoint(Piece.Color color) {
		double pointSum = 0;
		for(int i=0; i<chaseBoard.size(); i++) {
			pointSum += chaseBoard.get(i).getRankPoint(color);
			pawnCheckList.updateCheckList(color, chaseBoard.get(i).getPawnCheckList(color));
		}
		pointSum -= calculatePawnExceptionPoint(color);
		return pointSum;
	}
	
	public double calculatePawnExceptionPoint(Piece.Color color) {
		double minusPoint = 0.0;
		for(int i=0; i<8; i++) {
			int count = pawnCheckList.getPawnCheckList(i, color);
			if(count >= 2)
				minusPoint += (double)count/2.0;
		}
		return minusPoint;
	}
}
