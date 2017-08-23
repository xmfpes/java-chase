package chase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import chase.Piece.Color;
import util.StringUtils;

public class ChaseBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String BLANK = "........";
	private List<Rank> chaseBoard;
	
	public ChaseBoard() {
		chaseBoard=  new ArrayList<Rank>();
	}
	
	public void initialize() {
		chaseBoard.add(Rank.createBlackPieceRank());
		chaseBoard.add(Rank.createBlackPawnRank());
		for(int i=0; i<4; i++) {
			chaseBoard.add(Rank.createBlankRank());
		}
		chaseBoard.add(Rank.createWhitePawnRank());
		chaseBoard.add(Rank.createWhitePieceRank());
	}
	public String showBoard() {
		StringBuilder st = new StringBuilder();
		for(int i=0; i<chaseBoard.size(); i++) {
			for(int j=0; j<chaseBoard.get(i).getRankSize(); j++) {
				st.append(chaseBoard.get(i).findSinglePiece(j).getType().getBlackRepresentation());
			}
			st.append(StringUtils.NEWLINE);
		}
		
		return st.toString();
	}
	public int pieceCount() {
		return chaseBoard.size() * 8;
	}
	
	
	
	
}
