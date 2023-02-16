package day11.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 *  - �迭�� �������̽�
 *  - ���Լ���(FIFO) : ���� ���� ���� ���� ������. 
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("��ī��");
		queue.offer("������");
		queue.offer("���̸�");

		LinkedList<String> list = (LinkedList<String>)queue;
		
		list.remove();
		
		System.out.println(list.get(0));
		
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		
		System.out.println(list.size());
	}
}
