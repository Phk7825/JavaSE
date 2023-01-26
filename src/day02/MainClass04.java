package day02;
/*
 * [[기본 자료형]]
 * 3. 정수형
 * - 선언하는 방버
 * 		byte 변수명;    -128~127
 * 		short 변수명;	  -32768 ~ 32767
 * 		int 변수명;     -2,147,483,648 ~ 2,147,483,647
 *      long 변수형;    더 크다!
 *      
 * - 같은 정수형이지만 표현범위가 다르다.
 * byte(1byte) < short(2byte) < int(4byte) < long(8byte)
 * 
 */
public class MainClass04 {
public static void main(String[] args) {
	// 정수형 변수 선언과 동시에 값 대입하기
	byte iByte = 10;
	short iShort = 100;
	int iInt = 1000;
	long iLong = 10000;
	
	//저장된 값을 문자열로 출력하기
	iByte += 120; // iByte = iByte + 120;
	System.out.println("Byte형:" + iByte);
	System.out.println("Short형:" + iShort);
	System.out.println("Inte형:" + iInt);
	System.out.println("Long형:" + iLong);
}
}
