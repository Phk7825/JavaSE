package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "������ƿ";
	
	// ����Ŭ����
	public class HelloPrinter{
		// �޼ҵ�
		public void printHello() {
			System.out.println(name+ staticName+"���� Ŭ���� HelloPrinter �Դϴ�.");
			System.out.println("���� Ŭ���� HelloPrinter �Դϴ�.");
		}
	}
	
	//static ����Ŭ����  �ҼӸ� MyUtil�̴�
	public static class Calculator {
		//�޼ҵ�
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("���޹��� �� ������ ��:" + result);
			System.out.println(staticName+"static ���� Ŭ���� Calculator �Դϴ�.");
		}
	}
	
	
	
}
