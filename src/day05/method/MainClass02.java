package day05.method;

public class MainClass02 {
	public static String name; //�������� name ����	
	
	public static void main(String[] args) {
		
		setName("�Ḹ��"); // set�޼ҵ带 ���� ���������� �� ����
		String name = getName();  // get�޼ҵ带 ���� �������� �� �ҷ�����
		System.out.println(name);  
		
		int sum = sum(1,2,3);
		System.out.println("sum:" +sum);
	}
	
	// ���� X ���� O
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	// ���� O ���� O
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	
}


//get�� set�� ���� ����