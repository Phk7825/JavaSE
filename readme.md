# JavaSE

***

### 객체란?   
실제로 존재 또는 추상적으로 식별가능한 모든것   
최소한의 프로그램 단위.   

Java - 객체 설계도를 만든다. (a.k.a 와플틀)   
```
class 클래스명 extends 상속 implements 인터페이스1, 인터페이스2, 인터페이스3{
	생성자
	변수
	메소드
}
```

객체를 만드는방법(객체생성) --> 메모리에 객체를 올린다. --> 인스턴스화   
 * 클래스명(타입) 변수명 = new 클래스명();   

### 객체 구성요소
  - 변수 - 특징, 속성 값
  	- 타입   
  		- 기본형(8개) - boolean, byte, char, short, int, long, float, double(stack메모리생성)  
  		- 참조형 - 기본형 외 모든 변수 --> 객체 주소값 가지고 있는 변수 (heap메모리생성)
  	- 선언위치  
  		- 전역변수 - 클래스에 종속. 멤버변수 
  				- !초기화 하지 않으면 
  					- 참조형 null 값 
  					- 기본형은 default 값 boolean(false) 정수형(0) 실수형(0.0) 
  		- 지역변수 - 메소드 안에 선언. !주의 초기값 대입없을시 컴파일 에러 발생!! 초기화 필수!!!
  	- 동적/정적   
  		- 동적(default) - 일반변수
  		- 정적(static) - static이 선언된 변수(static메모리생성) / 실행시 생성 / 같은타입객체가 공유

  - 메소드(Method) - 기능, 코드집합
  	- 오버로딩 - 메소드명 중복 정의, 매개변수 타입 또는 개수 다르다.
	```
		// 메소드 구조
		접근제어자 (static) 리턴타입 메소드명(매개변수타입 매개변수명) {
			// 코드블럭 
			... 실행코드 ...
			return 리턴값;	// 리턴타입이 void면 생략가능
		}  
	```
	- 접근제어자 4가지
	```
		public - 모든 패키지 클래스에서 접근가능
		protected - 같은 패키지 또는 상속 관계에서 접근가능
		default(선언하지 않은 상태) - 같은패키지
		private - 같은클래스 내에서만!
	```
	
  - 생성자(Constructor) - 클래스 명과 같다. 객체가 생성되기전 한번만 실행된다.
	- 멤버필드 초기화용으로 자주 사용.
	- 메소드와 차이점은 리턴이 없다.
	- 오버로딩 가능하다.
	
  - 상속 - 부모클래스의 멤버를 자식클래스에서 사용 또는 재정의 가능.
	- 예약어 extends
	- super 예약어로 부모클래스 접근 가능
	- 부모 멤버 재정의 - 오버라이딩 (오버로딩이랑 다름)

  - 인터페이스 상속 - 클래스 상속과 비슷하지만 예약어가 implements 이다.
	- 추상메소드와 상수로만 구성되어 있다.
	- 일반상속과 달리 다중상속 가능하다.
	- 구성된 추상메소드는 반드시 오버라이딩 해줘야 한다.
	- new 인터페이스명() --> 익명클래스 생성이다.
	- 상속이랑 동시에 선언 가능하다.

  - 다형성 - 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다.
	```
		인터페이스타입 변수선언 = new 자식클래스();
		부모클래스타입 변수선언 = new 자식클래스();
	```
	
  - lang 패키지
	- Object 클래스 - 모든클래스의 슈퍼조상 클래스 (상속 생략되어있다)
	- Wrapper 클래스 - 8가지 기본형변수 참조형 Class로 제공. 여러 기능(메소드)가 있다.
	- String - 불변(immutable)의 클래스 메모리에 올라간 값 변경되지 않는다. 단 new String("값"); 예외

  - util 패키지
	- Collection
		- List - 가변 배열 객체, 인덱스 값 존재
		- Set - 순서가 없는 배열 객체, 중복값 없다.
		- Map - Key, Value로 구성되어 있다. Key는 중복값 없다. 
	- 날짜관련
		- Date , Calendar - 날짜관련 객체 
		- Scaner - 시스템(콘솔) 입력받을수 있는 객체
		- Random - 난수 생성 객체   
