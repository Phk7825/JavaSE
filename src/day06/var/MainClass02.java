package day06.var;

public class MainClass02 {
	
	public static int num2 = 20;
	public static int num3; // default �� 0
	public static double dNum;
	public static String str;
	public static boolean isBool;
	
	// �⺻��/�������� (main �ٱ���)
	
	public static void main(String[] args) {
		// �⺻��/��������
		int num = 10;
		
	
		System.out.println(num);
		System.out.println(num2);
	
		int result = sum(num); // int pNum = num;
		System.out.println(result);
		
		
		// �ʱ�ȭ ���� ���� �������� ���
		System.out.println(num3);
		
		int num4;
		// �ʱ�ȭ ���� ���� �������� ���Ұ�(�����Ͽ���!!)
		//System.out.println(num4);
		
		System.out.println(dNum);
		System.out.println(str);
		System.out.println(isBool);
	}

	public static int sum(int pNum) {
		return pNum + num2;
	}
}
