package day06.constant;

/*
 * [[���]]
 *  ó�� �Ҵ�� ���� ������� �ʴ´�.
 *  final Ű���� ���.
 *  ����� ������ �빮�ڷ� �����ϱ�!!
 * 
 * 
 */


public class MainClass01 {
	static final double PI = 3.14159;
	public static void main(String[] args) {
		
		// ���� ������ 
		int r = 10;
		
		// ���� ����
		double area = PI * r * r;
		System.out.println("���� ���� :" + area);
		
		area = 0;
		
		area = Math.PI * Math.pow(r, 2);
		System.out.println("���� ���� :" + area);
	}
}
