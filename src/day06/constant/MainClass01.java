package day06.constant;

/*
 * [[상수]]
 *  처음 할당된 값이 변경되지 않는다.
 *  final 키워드 사용.
 *  상수는 가능한 대문자로 선언하기!!
 * 
 * 
 */


public class MainClass01 {
	static final double PI = 3.14159;
	public static void main(String[] args) {
		
		// 원의 반지름 
		int r = 10;
		
		// 원의 넓이
		double area = PI * r * r;
		System.out.println("원의 넓이 :" + area);
		
		area = 0;
		
		area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이 :" + area);
	}
}
