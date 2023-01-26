package day04;

public class HomeWork {
	public static void main(String[] args) {

		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < 7; i++) {
				if (i < 7/2 +1) {
					if (j + i < 3) {
						System.out.println("");
					} else if (3 < j - i) {
						System.out.println("");
					} else {
						System.out.println("*");
					}
				} else {
					if (i - j > 3) {
						System.out.println("");
					} else if (i + j > 9) {
						System.out.println("");
					} else {
						System.out.println("*");
					}
				}
			}
		}
		System.out.println();
	}
}
