package day09.thread;
/*
 * [[ Runnable ]]
 * 	Thread 상속대신 인터페이스 상속으로 Thread 객체 생성하기
 * 
 */

import day09.mypac3.InterThread;

public class MainClass05 {
	public static void main(String[] args) {
		// 다형성 Runnable 인터페이스를 구현한 객체 생성
		Runnable iThread = new InterThread();
		// InterThread 생성한 객체를 Thread 객체를 생성하여 인자로 전달
		Thread thread = new Thread();
		// Thread 객체의 start() 메소드를 호출하여 새로운 스레드가 시작된다.
		thread.start();
		
		System.out.println("메인스레드가 종료됩니다.");
	}

}
