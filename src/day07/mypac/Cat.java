package day07.mypac;

public class Cat extends Animal {
	
	@Override
	public void move() {	// 상속 move 재정의
		System.out.println("점프를 뛴다!!");
	}
	
	public void likeChur() {
		System.out.println("츄르를 좋아해!!");
	}
}
