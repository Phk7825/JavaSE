package day06.mypac;

public class Card {
	public static int width = 62;
	public static int height = 88;
	public static Card card;
	//static 유무에 따라서 변수값의 차이가 발생한다.
	
	public static String type = "Spade";
	public String number = "A";

	public static String getType() {
		
		return new Card().type;
	}
}
