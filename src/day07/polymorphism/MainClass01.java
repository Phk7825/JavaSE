package day07.polymorphism;

import day07.mypac.AkWeapon;
import day07.mypac.M16;
import day07.mypac.M4A1Weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

/*
 * [[ ������ (polymorphism) ]]
 * 	�ϳ��� ��ü�� �������� Ÿ���� ������ �ִ� ���� �ǹ��Ѵ�.
 * 	
 * instanceof ������
 * 	��ü�� � Ŭ������ ��ӹް� �ִ��� boolean���� ��ȯ.
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.doSnip();
		
		//m4a1:������ ���� , �ּҰ��� ������ �ִ�.
		Weapon m4a1 = new M4A1Weapon();
		m4a1.attack();
		
		
		M4A1Weapon m4Real = (M4A1Weapon) m4a1;
		
		m4Real.attack();
		m4Real.doSnip();
		
		//m4a1 m4Real �������? �ٸ����?   ������ ����!!!
		System.out.println(System.identityHashCode(m4a1));
		System.out.println(System.identityHashCode(m4Real));
		System.out.println(System.identityHashCode(ak));
		
		//m4a1 m4Real ������ ��? m4a1�� doSnip �ȵǴ°�?  => ������������!
	
		M16 m16 = new M16();
		
		classifyWeapon(m16);
		classifyWeapon(m4a1);
		classifyWeapon(m4Real);
		classifyWeapon(ak);
		
	
	}
	
	//���� �����ϴ� �޼ҵ�
	public static void classifyWeapon(Weapon weapon) { // Weapon weapon = m16       ,Object weapon �̸� ���� classifyweapon�� �ƹ��ų� ����
		if (weapon instanceof Scope) {
			System.out.println("���ݼ��� �Դϴ�.");
		} else {
			System.out.println("�Ϲݼ��� �Դϴ�");
		}
	}




}




