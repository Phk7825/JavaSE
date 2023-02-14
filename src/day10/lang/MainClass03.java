package day10.lang;
/*
 * [[ ���� Ŭ����(Wrapper Class) ]]
 * 	8���� �⺻Ÿ�Կ� �ش��ϴ� �����͸� ��ü�� ǥ��.
 * 	boolean, byte, short, char, int, long, float, double
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean b1 = true; // �⺻�� ����
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean(false);
		
		Boolean b4 = Boolean.valueOf("true");
		 
		if(b4) {
			System.out.println("b4�� true �Դϴ�.");
		}else {
			System.out.println("b4�� false �Դϴ�.");
		}
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// int Wrapper Class
		Integer number1 = new Integer(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		System.out.println("number1 == number2" + (number1 == number2));
		System.out.println("number1 == number3" + (number1 == number3));
		System.out.println("number1.equals(number2)" + (number1.equals(number2)));
		
		System.out.println(System.identityHashCode(number1));
		System.out.println(System.identityHashCode(number2));
		
		if(number1 == number2) {
			System.out.println("number1 �� number2�� �����ϴ�.");
		}else {
			System.out.println("number1 �� number2�� �ٸ��ϴ�.");
		}
		
//		String str1 = "hello";
//		String str2 = "hello";
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		if(str1.equals(str2)) {
			System.out.println("str1 �� str2�� �����ϴ�.");
		}else {
			System.out.println("str1 �� str2�� �ٸ��ϴ�.");
		}
		
		int num1 = Integer.parseInt("1000");
		int num2 = Integer.parseInt("2000");
		
		System.out.println(num1 + num2);
	}
}
