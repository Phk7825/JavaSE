package day08.exception;

import java.util.Random;

public class MainClass02 {
	public static void main(String[] args) {
		Random ran = null;
		// �������� ������ �������� �ʱ�ȭ
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			ran.nextInt();	//null ���� �߻�
			result = num1/num2;		// /by zero ���� �߻�
		}catch(ArithmeticException ae) {
			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");
		}catch(NullPointerException ne) {
			System.out.println("null ������ �ͼ��� �߻��Ͽ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
		}
		

	}
}
