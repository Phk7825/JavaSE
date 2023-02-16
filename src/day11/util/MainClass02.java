package day11.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * [[ ArrayList Class ]] �� ���� ����.
 *  - �����迭 ��ü
 *  - ���� �迭�̴�.
 *	- �ε��� ���� �ִ�.
 *
 */
public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// ������ �����ϱ�
		list.add("��ī��"); //0
		list.add("������"); //1
		list.add("���̸�"); //2
		
		// ����� �������� Ư�� �ε��� �� ������
		String str = list.get(0);
		System.out.println("list 0 �ε��� ��: " +str);
		
		// ����� �����Ϳ��� Ư�� �ε��� ���� �����ϱ�
		list.remove(1);
		
		System.out.println("����� �������� ����:" + list.size());
		
		for(int i=0; i < list.size(); i++) {
			System.out.println("list["+i+"]: " + list.get(i));
		}
	
		for(String name : list) {
			System.out.println("name:" + name);
		}
		
		// �������� �̿��Ͽ� List Ÿ������ ArrayList ��ü ����
		List<String> list2 = new ArrayList<>();
		// ��������
		List<String> list3 = (List<String>) list.clone();
		System.out.println("������ list3 0�ε��� ��: " + list3.get(0));
		
		// ArrayList�� ����� �����ϴ�.
		LinkedList<String> link = new LinkedList<>();
		link.add("�Ḹ��");
		link.add("��ġ����");
		
		for(String name: link) {
			System.out.println("linked name: " + name);
		}
	}
}
