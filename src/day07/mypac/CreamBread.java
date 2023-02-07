package day07.mypac;

public class CreamBread extends Bread {

	public CreamBread() {
		super();	// 자식클래스에서 부모생성자 호출, 이 줄은 제일 위에 있어야한다.
		super.breadName = "크림빵";
		super.breadPrice = 1500;
		
	}
	
}
