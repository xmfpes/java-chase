package chase;

import java.util.ArrayList;
import java.util.List;

public class ChaseBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String BLANK = "........";
	private List<Piece> whitePawnList;
	private List<Piece> blackPawnList;
	public ChaseBoard() {
		whitePawnList = new ArrayList<Piece>();
		blackPawnList = new ArrayList<Piece>();
	}
	public void addWhite(Piece pawn) {
		whitePawnList.add(pawn);
	}
	public void addBlack(Piece pawn) {
		blackPawnList.add(pawn);
	}
	public int getWhiteSize() {
		return whitePawnList.size();
	}
	public int getBlackSize() {
		return blackPawnList.size();
	}
	public Piece findWhitePawn(int index) {
		return whitePawnList.get(index);
	}
	public Piece findBlackPawn(int index) {
		return blackPawnList.get(index);
	}
	public StringBuilder getWhitePawnsResult() {
		StringBuilder st = new StringBuilder();
		for(int i=0; i<whitePawnList.size(); i++) {
			if(whitePawnList.get(i).getColor() == "white")
				st.append('p');
		}
		return st;
	}
	public StringBuilder getBlackPawnsResult() {
		StringBuilder st = new StringBuilder();
		for(int i=0; i<blackPawnList.size(); i++) {
			if(blackPawnList.get(i).getColor() == "black")
				st.append('P');
		}
		return st;
	}
	public void initialize() {
		for(int i=0; i<8; i++) {
			
		}
	}
}
