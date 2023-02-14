package day09.mypac3;

public class InterThread extends Object implements Runnable {
	
	@Override
	public void run() {
		System.out.println("InterThread가 시작 되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("InterThread가 종료됩니다.");
	}

}
