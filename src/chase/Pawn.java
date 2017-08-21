package chase;

public class Pawn {
	private String color;
	public Pawn(String color) {
		this.color = color;
	}
	public static Pawn createBlack() {
		return new Pawn("black");
	}
	public static Pawn createWhite() {
		return new Pawn("white");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
