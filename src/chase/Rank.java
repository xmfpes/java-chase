package chase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import chase.Piece.Color;

public class Rank {
	private List<Piece> rank;
	private List<Integer> checkPawn;
	public Rank() {
		rank = new ArrayList<Piece>();
		checkPawn = new ArrayList<Integer>();
	}
	public Rank(List<Piece> rank) {
		this.rank = rank;
	}
	
	public Piece findPiece(int index) {
		return rank.get(index);
	}
	
	public void setPiece(int index, Piece piece) {
		rank.set(index, piece);
	}
	public int findPieceCountInRank(Piece.Color color, Piece.Type type) {
		int pieceCount = 0;
		for(int i=0; i<rank.size(); i++) {
			if(getIndexPiece(i).getColor() == color && getIndexPiece(i).getType() == type)
				pieceCount++;
		}
		return pieceCount;
	}
	
	public Piece getIndexPiece(int index) {
		return rank.get(index);
	}
	public int getRankSize() {
		return rank.size();
	}
	
	public static Rank createBlackPieceRank(){
		List<Piece> blackPieceList = new ArrayList<Piece>();
		blackPieceList.add(Piece.createBlackRook());
		blackPieceList.add(Piece.createBlackKnight());
		blackPieceList.add(Piece.createBlackBishop());
		blackPieceList.add(Piece.createBlackQueen());
		blackPieceList.add(Piece.createBlackKing());
		blackPieceList.add(Piece.createBlackBishop());
		blackPieceList.add(Piece.createBlackKnight());
		blackPieceList.add(Piece.createBlackRook());
		return new Rank(blackPieceList);
	}
	
	public static Rank createBlackPawnRank(){
		List<Piece> blackPawnList = new ArrayList<Piece>();
		for(int i=0; i<8; i++)
			blackPawnList.add(Piece.createBlackPawn());
		return new Rank(blackPawnList);
	}
	
	public static Rank createBlankRank() {
		List<Piece> blankList = new ArrayList<Piece>();
		for(int i=0; i<8; i++)
			blankList.add(Piece.createBlank());
		return new Rank(blankList);
	}
	
	public static Rank createWhitePieceRank() {
		List<Piece> whitePieceList = new ArrayList<Piece>();
		whitePieceList.add(Piece.createWhiteRook());
		whitePieceList.add(Piece.createWhiteKnight());
		whitePieceList.add(Piece.createWhiteBishop());
		whitePieceList.add(Piece.createWhiteQueen());
		whitePieceList.add(Piece.createWhiteKing());
		whitePieceList.add(Piece.createWhiteBishop());
		whitePieceList.add(Piece.createWhiteKnight());
		whitePieceList.add(Piece.createWhiteRook());
		return new Rank(whitePieceList);
	}
	
	public static Rank createWhitePawnRank(){
		List<Piece> whitePawnList = new ArrayList<Piece>();
		for(int i=0; i<8; i++)
			whitePawnList.add(Piece.createWhitePawn());
		return new Rank(whitePawnList);
	}
	
	public double getRankPoint(Piece.Color color) {
		double point = 0;
		for(int i=0; i<rank.size(); i++) {
			if(rank.get(i).getColor() == color) {
				point += rank.get(i).getType().getDefaultPoint();
			}
		}
		return point;
	}
	
	public int [] getPawnCheckList(Piece.Color color) {
		int [] check = new int[8];
		for(int i=0; i<rank.size(); i++) {
			if(rank.get(i).getType() == Piece.Type.PAWN && rank.get(i).getColor() == color) {
				check[i] += 1;
			}
		}
		return check;
	}
	
}
