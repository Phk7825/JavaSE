package day09.thread;
/*
 * synchronized - ����ȭ�� �����ִ� �����
 * 
 * 
 */
import day09.mypac2.Brother;
import day09.mypac2.Sister;
import day09.mypac2.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// wallet ��ü �����ϱ� 
		Wallet wallet = new Wallet();
		
		// Sister ������ ��ü ����
		Sister sister = new Sister(wallet);
		
		// Brother ������ ��ü ����
		Brother brother = new Brother(wallet);
		
		// ������ ��ü�� �̿��ؼ� �ΰ��� ������ ���۽�Ű��
		sister.start();
		brother.start();
		
		System.out.println("���ν����尡 ����˴ϴ�.");
		
	}
}


//��������� ���� ���ڰ� ������ �ʴ´�.
