package day08.exception;
/*
 * [[ ����(Exception) ]]
 * 	- ���α׷� ���൵�� �߻��Ǵ� ������ �ش�ȴ�. 
 * 	- ����ó�� : ���ܰ� �߻��Ǿ��� �� �̸� ó���ϴ� ��.
 * 	
 * 	ó���ϴ� ���
 * 
 * 	try {
 * 		�����ڵ�
 * } catch(�ͼ���Ŭ������ ������){
 *  	�ش� ���ܰ� �߻����� ��� ������ �ڵ�
 * } finally {
 * 		���� �Ǵ� ���ܰ� �߻��ص� ����Ǵ� ��
 * }
 * 
 */


public class MainClass01 {
	public static void main(String[] args) {
		// �������� ������ �������� �ʱ�ȭ
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		
		// �и� num2 ���� 0�̸� -> "��� ���� 0���� ���� �� �����ϴ�."
//		if(num2 !=0) {
//			result = num1/num2; //compile�� ������ �����Ͱ��� ������ ���ܼ� ���� ����, 10/0�� ���� �ȵȴ�.
//			System.out.println("result:" + result);
//		}else {
//				System.out.println("��� ���� 0���� ���� �� �����ϴ�.");	
//			}
		
		try {
			//���� �����ڵ�
			result = num1/num2; //compile�� ������ �����Ͱ��� ������ ���ܼ� ���� ����, 10/0�� ���� �ȵȴ�.
			System.out.println("result:" + result);
		} catch (Exception e) {
			//���� �߻��� ����
//			System.out.println("��� ���� 0���� ���� �� �����ϴ�.");	
			System.out.println("�����ڿ� ���� �ٶ��ϴ�. 1544-4500");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}
