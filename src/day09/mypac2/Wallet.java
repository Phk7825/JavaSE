package day09.mypac2;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
//public synchronized int getMoney() {
	//	
		//if(totalMoney == 0)
			//return 0;
		//
//		totalMoney = totalMoney - 1;
	//	System.out.println("���� ������ �ݾ�: " +totalMoney);
		//return 1;
		
//	}
	public synchronized int getMoney() {
		
		if(totalMoney == 0)
			return 0;
		
		synchronized(this) {
		totalMoney = totalMoney;
		System.out.println("���� ������ �ݾ�: " +totalMoney);
		return 1;
		}
	}

}
//synchronized �� �� ���̸� ���� 10000�� �� �㶧�� �ִ�.