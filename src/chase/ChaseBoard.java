package chase;

import java.util.ArrayList;
import java.util.List;

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
		List<Piece> list;
		list = new ArrayList<Piece>();
		for(int i=0; i<8; i++) {
			list.add(Piece.createBlackPawn());
		}
		chaseBoard.add(new Rank(list));
		list = new ArrayList<Piece>();
		list.add(Piece.createBlackRook());
		list.add(Piece.createBlackKnight());
		list.add(Piece.createBlackBishop());
		list.add(Piece.createBlackQueen());
		list.add(Piece.createBlackKing());
		list.add(Piece.createBlackBishop());
		list.add(Piece.createBlackKnight());
		list.add(Piece.createBlackRook());
		chaseBoard.add(new Rank(list));
		for(int i=0; i<4; i++) {
			list = new ArrayList<Piece>();
			for(int j=0; j<8; j++) {
				list.add(Piece.createBlank());
			}
			chaseBoard.add(new Rank(list));
		}
		list = new ArrayList<Piece>();
		for(int i=0; i<8; i++) {
			list.add(Piece.createBlackPawn());
		}
		chaseBoard.add(new Rank(list));
		list = new ArrayList<Piece>();
		list.add(Piece.createWhiteRook());
		list.add(Piece.createWhiteKnight());
		list.add(Piece.createWhiteBishop());
		list.add(Piece.createWhiteQueen());
		list.add(Piece.createWhiteKing());
		list.add(Piece.createWhiteBishop());
		list.add(Piece.createWhiteKnight());
		list.add(Piece.createWhiteRook());
		chaseBoard.add(new Rank(list));
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
