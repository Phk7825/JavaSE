package day09.innerclass;

import day09.mypac.Weapon;

/*
 * [[ �͸�Ŭ���� (AnonyMous Class) ]]
 * 	Ŭ���� ����� ��ü������ ���ÿ� �ϴ� �̸����� Ŭ����
 * 	��ȸ�� Ŭ���� 
 * 
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		
		Weapon w = new Weapon() {	// �͸� Ŭ����, ��ȸ���̶�� �����ϸ� �ȴ�.
			
			int damage = 10;
			
			@Override
			public void attack() {
				System.out.println(damage + "�������� ����!!");
				
			}
		}; 
		
		w.attack();
		
	}
}
