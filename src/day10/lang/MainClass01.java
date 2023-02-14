package day10.lang;
/*
 * [[ java.lang ��Ű�� ]]
 * 	�⺻ �������ִ� ��Ű��
 *  import�� �ʿ����!!
 *  
 *  [[ Object Ŭ���� ]]
 * 	 ��� Ŭ������ �ֻ��� �θ��̴�.
 * 	 �� ��� Ŭ������ Object Ŭ������ ��� �޴´�.
 * 	 extends ����!!
 * 	
 * 		equals() �޼ҵ� : �� ��ü�� ������ ��ü true
 * 							     �ٸ��� false
 * 		hashCode() �޼ҵ� : 
 * 			��ü�� �޸� ������ �̿�, �ؽ��ڵ带 ����� ����
 * 		toString() �޼ҵ� : 
 * 			��ü�� ���� ������ ����, �� ��ü�� ���ڿ��� ǥ��
 * 		clone() : ���ο� ��ü�� ����(���� ����) 
 * 				  Cloneable �������̽� ��ӹ��� ��ü ��밡��
 * 
 */

import day10.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		if(car1.equals(car2)) {
			System.out.println("car1 �� car2�� �����ϴ�.");
		} else {
			System.out.println("car1 �� car2�� �ٸ��ϴ�.");
		}
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		// immutable �Һ��� ���� �⺻��`
		int num1= 10;
		int num2= 10;
		int num3= 11;
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num3));
		num3 = 10;
		System.out.println(System.identityHashCode(num3));
		
		// toString() �޼ҵ� : Ŭ�������� + "@" + 16������ ��ȯ �ּҰ�
		System.out.println(car1); // toString() ����
		System.out.println(car2); // toString() ����

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		// String toString() �������̵� : ���ڿ� ���� ������ ������ �ߴ�.
		String str = "hello";
		System.out.println("str: " +str);
		System.out.println("str: "+str.toString());
		
		String str2 = new String("hello");
		System.out.println("str2:" +str2);
		System.out.println("str2:" +str2.toString());
		
		Car car3 = new Car("��Y");
		System.out.println(car3);
	}

}
