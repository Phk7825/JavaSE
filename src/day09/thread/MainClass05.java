package day09.thread;
/*
 * [[ Runnable ]]
 * 	Thread ��Ӵ�� �������̽� ������� Thread ��ü �����ϱ�
 * 
 */

import day09.mypac3.InterThread;

public class MainClass05 {
	public static void main(String[] args) {
		// ������ Runnable �������̽��� ������ ��ü ����
		Runnable iThread = new InterThread();
		// InterThread ������ ��ü�� Thread ��ü�� �����Ͽ� ���ڷ� ����
		Thread thread = new Thread();
		// Thread ��ü�� start() �޼ҵ带 ȣ���Ͽ� ���ο� �����尡 ���۵ȴ�.
		thread.start();
		
		System.out.println("���ν����尡 ����˴ϴ�.");
	}

}
