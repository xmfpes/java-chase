package chase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rank {
	private List<Piece> rank;
	public Rank() {
		rank = new ArrayList<Piece>();
	}
	public Rank(List<Piece> rank) {
		this.rank = rank;
	}
	public Piece findSinglePiece(int index) {
		return rank.get(index);
	}
	public int getRankSize() {
		return rank.size();
	}
}
