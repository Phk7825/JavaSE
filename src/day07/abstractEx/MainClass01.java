package day07.abstractEx;

import day07.mypac.Man;
import day07.mypac.Woman;

/*
 * [[ �߻�Ŭ���� (Abstract Class) ]]
 * 	�������� ���� �߻� �޼ҵ尡 �����Ѵ�.
 * 	���Ǹ� �ϰ� ���� X 
 * 	�̿ϼ� Ŭ������� �Ѵ�
 * 	�̿ϼ� �޼ҵ带 ������ �ִ�.
 * 	����� �ް� �ݵ�� �������̵� �ؾ��Ѵ�. 
 * 
 * Ctrl + shift + O : ����Ʈ ����Ű
 * 
 * �ǹ������� �� �� ���ٰ� �Ѵ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//	�߻�Ŭ������ ��ü ������ �� ����.
		//	Human h1 = new Human();
		
		Man m1 = new Man();
		m1.useFire();
		m1.say();
		
		Woman w1 = new Woman();
		w1.useFire();
		
	}
}





