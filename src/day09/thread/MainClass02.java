package day09.thread;

import day09.mypac2.CountThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("���ν����尡 ���۵˴ϴ�.");
		
		new CountThread().start();
		
		System.out.println("���ν����尡 ����˴ϴ�.");
	}
}
