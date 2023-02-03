package day07.mypac;

public class PersianCat extends Cat{
	
	@Override	// 부모 메소드 재정의
	public void move() {
		System.out.println("우아하게 움직인다.");
		super.move();
		//super를 사용하면 상위클래스의 결과를 같이 출력한다.
	}
	
	
	public void getColor() {
		System.out.println("하얗다!!");
	}
}
