package day09.thread;

public class MainClass06 {
	public static void main(String[] args) {
		
		new Thread(new Runnable() { // �͸� Ŭ����
			@Override
			public void run( ) {
				System.out.println("�����尡 ���۵Ǿ����ϴ�.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�����尡 ����˴ϴ�.");
				
				}
			
			}).start();
		
		System.out.println("���ν����尡 ����˴ϴ�.");
		}
	}
