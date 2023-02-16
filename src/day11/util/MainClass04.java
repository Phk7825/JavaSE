package day11.util;

import java.util.HashSet;
import java.util.Iterator;

/*
 * [[ HashSet Class ]]
 *  - ������ ������ ����. 
 *  - �ߺ����� ���� �ʴ´�.
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		// ������ ����
		hs.add("��ī��");
		hs.add("������");
		hs.add("���̸�");
		
		// ������ Ȯ��
		System.out.println(hs.size());
		
		//Iterator(�ݺ���) ��ü �̿��ؼ� ���
		Iterator<String> it = hs.iterator();

		while(it.hasNext()) { // hasNext() �����͸� ������� ������ �ִٸ� true
			// �� �о����
			String value = it.next();
			// ���
			System.out.println("name:" +value);
		}
		
		System.out.println("hs size:" + hs.size());
	}
}
