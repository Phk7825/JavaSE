package day06.construct;

import day06.mypac.HandPhone;
/*
 * [[������ (Constructor) ]]
 * 	��ü�� ������ �� ȣ���ϴ� ��ȯ���� ���� �޼ҵ�. ��� �޼ҵ�� �ƴϴ�!
 *  ��ü �ʱ�ȭ ������ ���.
 *  Ŭ������� �����ϴ�.
 *  �����ε� �����ϴ�.
 *  
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		System.out.println(hp.model);
		
		HandPhone hp2 = new HandPhone("������");
		System.out.println(hp2.model);
		
	}
	
}
