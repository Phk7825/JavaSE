package day09.thread;

import day09.mypac2.MyThread;

/*
 * [[ Thread ]]
 *  ������� ���α׷� ������ ����Ǵ� ���α׷� ���� �帧(�������)�� ���Ѵ�. 
 * 	�ϳ��� ���μ��� ���ο��� ���������� ����Ǵ� �ϳ��� �۾������� ���Ѵ�.
 * 	���� ���α׷���
 * 	�񵿱� ���α׷���
 * 	
 * [[ ���ο� �����带 ���۽�Ű�� ��� ]]
 * 	1. Thread ��ü�� ������ �� �ִ� Ŭ���� ����
 * 	2. ������ Ŭ������ �̿��ؼ� ��ü����
 * 	3. ������ ��ü�� start() �޼ҵ带 ȣ���Ѵ�.
 * 		!���� run() �޼ҵ� ȣ�� �ƴ�!!
 * 
 */

public class MainClass01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("���� ������ ����");
		MyThread thread1 = new MyThread();
		thread1.start();
		
		Thread.sleep(500);
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}
