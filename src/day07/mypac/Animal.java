package day07.mypac;

public class Animal {

	
	public String name;
	//private = Animal 클래스 안에서만 가능
	// 변수의 직접접근 막기 위해 get set메소드 이용
	
	//set메소드 - 값 설정하기
	// 이름 지어주기
	public void setName(String name) {
		this.name = name;
	// this: 자기 자신에 있는 멤버, 즉 이 클래스 안에 직접적으로 종속되어 있는 변수
	}
	
	// get메소드 - 값 불러오기
	public String getName() {
		return name;
	}
	
	// 움직인다.
	public void move() {
		System.out.println("움직인다.");
	}
}
