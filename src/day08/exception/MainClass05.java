package day08.exception;

import day08.mypac2.NumberPrinter;
/*
 * throws - ���ܰ� �߻��ϸ� �����޼ҵ�� ���ܸ� ������.
 * 
 * 
 * 
 */

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();		
//		try {
//			np.printNumber();			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		np.printNumber();
		
		// ������ �ͼ��� �߻���Ű��
		throw new NullPointerException();
		
	}
}
