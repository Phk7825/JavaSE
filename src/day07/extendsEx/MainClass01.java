package day07.extendsEx;

import day07.mypac.Cat;
import day07.mypac.PersianCat;

/*
 * [[ ��� ]]
 *  �θ� Ŭ����(���� Ŭ����)�� �ڽ� Ŭ����(���� Ŭ����)�� ������, 
 * 	�ڽ� Ŭ������ �θ� Ŭ������ �����ؼ�,
 * 	�� �θ��� ����� ��� �޾� �״�� �� �� �ְ� �ȴ�.
 * 	
 * 	Ŭ���� 1���� ��� 1��
 * 
 * 	���� â �� ���� ��: ctrl + shift + w
 */

public class MainClass01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		// ����� �̸������ֱ�
		cat.setName("��������");
		
		String catName = cat.getName();
		System.out.println(catName);
		System.out.println(cat.name);
		
		cat.likeChur();
		cat.move();
		
		PersianCat pCat = new PersianCat();
		pCat.getColor();
		pCat.setName("������");
		System.out.println(pCat.getName());
		
		pCat.move();
		
		// ��� Ŭ������ �ֻ��� �θ��̴�.
		//Object obj = new Object();
	}
}
