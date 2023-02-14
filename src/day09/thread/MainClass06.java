package day09.thread;

public class MainClass06 {
	public static void main(String[] args) {
		
		new Thread(new Runnable() { // 익명 클래스
			@Override
			public void run( ) {
				System.out.println("스레드가 시작되었습니다.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("스레드가 종료됩니다.");
				
				}
			
			}).start();
		
		System.out.println("메인스레드가 종료됩니다.");
		}
	}
