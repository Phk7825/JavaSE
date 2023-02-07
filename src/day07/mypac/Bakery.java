package day07.mypac;


/*
 * TODO 빵집
 * 1 빵종류
 * 2 케이크종류
 * 3 음료
 * 
 * 3. 빵굽기
 * 4. 카페
 * 5. 카운트
 * 
 */

public class Bakery {
	// 빵류 객체
	public Bread[] bread;
	
	// 케이크류 객체
	public Cake[] cake;
	
	// 커피류 객체
	public Coffee[] coffee;
	
	public Bakery(Bread[] bread, Cake[] cake, Coffee[] coffee) {
		this.bread = bread;
		this.cake = cake;
		this.coffee = coffee;
		System.out.println("빵집 오픈하였습니다.");
	}
	
	public static void main(String[] args) {
		CreamBread cb = new CreamBread();
		RedBeanBread rbb = new RedBeanBread();
		
		
		ChocoCake cc = new ChocoCake();
	//	System.out.println("케이크 이름: " + cc.cakeName);
	//	System.out.println("케이크 가격: " + cc.cakePrice);
		
		Bread[] breadArray = new Bread[2];
		breadArray[0] = cb;
		breadArray[1] = rbb;
		
		Cake[] cakeArray = new Cake[1];
		cakeArray[0] = cc;
		
		Bakery parisBaguette = new Bakery(breadArray, cakeArray, null);
		
		for(Bread bread: parisBaguette.bread) {
			System.out.println(bread.breadName+" 가격: " + bread.breadPrice + "원 입니다.");
		}
		
		for(int i=0; i <parisBaguette.bread.length; i++) { //위의 for문과 같음
			Bread bread = parisBaguette.bread[i];
			System.out.println(bread.breadName+" 가격: " + bread.breadPrice + "원 입니다.");
		}
		
		for(Cake cake: parisBaguette.cake) {
			System.out.println(cake.cakeName+" 가격: " + cake.cakePrice + "원 입니다.");
		}
		
	//	Bakery bakery = new Bakery(cb, cc, null);
		
	//	CreamBread bakeryCreamBread = (CreamBread) bakery.bread;
		
	//	System.out.println("빵 이름 : " + bakeryCreamBread.breadName);
	//	System.out.println("빵 가격 : " + bakeryCreamBread.breadPrice);
	}
	
}
