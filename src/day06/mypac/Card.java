package day06.mypac;

public class Card {
	public static int width = 62;
	public static int height = 88;
	public static Card card;
	//static ������ ���� �������� ���̰� �߻��Ѵ�.
	
	public static String type = "Spade";
	public String number = "A";

	public static String getType() {
		
		return new Card().type;
	}
}
