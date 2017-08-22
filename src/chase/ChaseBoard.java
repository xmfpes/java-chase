package chase;

import java.util.ArrayList;
import java.util.List;

import chase.Piece.Color;
import util.StringUtils;

public class ChaseBoard {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String BLANK = "........";
	private List<Piece> whitePawnList;
	private List<Piece> whitePieceList;
	private List<Piece> blackPawnList;
	private List<Piece> blackPieceList;
	public ChaseBoard() {
		whitePawnList = new ArrayList<Piece>();
		whitePieceList = new ArrayList<Piece>();
		blackPieceList = new ArrayList<Piece>();
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
			if(whitePawnList.get(i).getColor() == Color.WHITE)
				st.append('p');
		}
		return st;
	}
	public StringBuilder getBlackPawnsResult() {
		StringBuilder st = new StringBuilder();
		for(int i=0; i<blackPawnList.size(); i++) {
			if(blackPawnList.get(i).getColor() == Color.BLACK)
				st.append('P');
		}
		return st;
	}
	public void initialize() {
		for(int i=0; i<8; i++) {
			blackPawnList.add(Piece.createBlackPawn());
			whitePawnList.add(Piece.createWhitePawn());
		}
		blackPieceList.add(Piece.createBlackRook());
		blackPieceList.add(Piece.createBlackKnight());
		blackPieceList.add(Piece.createBlackBishop());
		blackPieceList.add(Piece.createBlackQueen());
		blackPieceList.add(Piece.createBlackKing());
		blackPieceList.add(Piece.createBlackBishop());
		blackPieceList.add(Piece.createBlackKnight());
		blackPieceList.add(Piece.createBlackRook());
		
		whitePieceList.add(Piece.createWhiteRook());
		whitePieceList.add(Piece.createWhiteKnight());
		whitePieceList.add(Piece.createWhiteBishop());
		whitePieceList.add(Piece.createWhiteQueen());
		whitePieceList.add(Piece.createWhiteKing());
		whitePieceList.add(Piece.createWhiteBishop());
		whitePieceList.add(Piece.createWhiteKnight());
		whitePieceList.add(Piece.createWhiteRook());
	}
	public String showBoard() {
		StringBuilder st = new StringBuilder();
		for(int i=0; i<blackPieceList.size(); i++) {
			st.append(blackPieceList.get(i).getType().getBlackRepresentation());
		}
		st.append(StringUtils.NEWLINE);
		for(int i=0; i<blackPawnList.size(); i++) {
			st.append(blackPawnList.get(i).getType().getWhiteRepresentation());
		}
		st.append(StringUtils.NEWLINE);
		st.append(BLANK);
		st.append(StringUtils.NEWLINE);
		st.append(BLANK);
		st.append(StringUtils.NEWLINE);
		st.append(BLANK);
		st.append(StringUtils.NEWLINE);
		st.append(BLANK);
		st.append(StringUtils.NEWLINE);
		for(int i=0; i<whitePawnList.size(); i++) {
			st.append(whitePawnList.get(i).getType().getWhiteRepresentation());
		}
		st.append(StringUtils.NEWLINE);
		for(int i=0; i<whitePieceList.size(); i++) {
			st.append(whitePieceList.get(i).getType().getBlackRepresentation());
		}
		st.append(StringUtils.NEWLINE);
		return st.toString();
	}
	public int pieceCount() {
		return whitePieceList.size() + blackPieceList.size() + whitePawnList.size() + whitePieceList.size();
	}
}
