package day11.util;

import java.util.Vector;

/*
 * [[ Vector Class ]]
 *  - ArrayList�� ����
 *  - Thread safe
 *  - ArrayList���� ���̴�.
 *  
 */

public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		// �߰�
		vec.add("��ī��");
		vec.add("������");
		vec.add("���̸�");
		
		// ����� �����Ϳ��� Ư�� �ε��� ���� �����ϱ�
		vec.remove(1);
		
		System.out.println("����� �������� ����:" + vec.size());
		
		for(int i=0; i < vec.size(); i++) {
			System.out.println("list["+i+"]: " + vec.get(i));
		}
	
		for(String name : vec) {
			System.out.println("name:" + name);
		}
		
	}
}
