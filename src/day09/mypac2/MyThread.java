package day09.mypac2;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread ���� �۾��� �ؿ�!");
		
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("MyThread �� ����˴ϴ�.");
	}

}
