package day08.exception;

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = 0;
		try {
			System.out.println("DB�� �����մϴ�.");
			System.out.println(ran.nextInt()/num);  // throw new ArithmeticExcpetion
		} catch (Exception e) {	// Exception e = new ArithmeticExcpetion();
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		} finally { // �ݵ�� ������ ����Ǵ� ��			
			System.out.println("DB ���� �����մϴ�.");
		}
	}

}
