package day05.method;
/*
 * [[�޼ҵ�(method) ]]
 *  � Ư�� �۾��� �����ϱ� ���� ��ɹ��� ����
 *  
 *  (����������) (����) ��ȯŸ�� �޼ҵ��̸�(�Ű�����Ÿ�� �Ű�������) {  //�����
 *  	������ �ڵ�(��ɹ�)   //������
 *     
 *      return ��ȯ��;   //void �϶� ��������
 *  }
 *  
 *  
 *  �����ε�(overloading)
 *  	�޼ҵ� ���� ���Ƶ�, �Ű����� ���� �Ǵ� Ÿ���� �ٸ��� ��밡��.
 *  
 */
public class MainClass01 {
	public static void main(String[] args) {
		// hello �޼ҵ� ȣ���ϱ�
		hello();
		
		//printName �޼ҵ� ȣ���ϱ�
		printName("��ī��");
		printName("��ī��","��");
		printName(1000);
		printName(1000,"T-");
		
	}
	 // ���� X ���� X -> ȣ��� �����ϰ� ������ �޼ҵ�
	public static void hello() {     //void = ��ȯŸ�� X
		System.out.println("Hello, world");

	}
	
	//���� O ���� X 
	public static void printName(String name) {
		System.out.println("�̸� : "+name);
	}
	// �����ε�(overloading)
	//���� O ���� X 
	public static void printName(String firstName,String lastName) {
		System.out.println("�̸� :" + firstName);
		System.out.println("�� :" + lastName);
	}
	// �����ε�(overloading)
	//���� O ���� X 
	public static void printName(int Name) {
		System.out.println("�κ���ȣ:"+ Name);
	}
	public static void printName(int firstName, String lastName) {
		System.out.println("�̸�:" +lastName+ firstName);
	}

}

