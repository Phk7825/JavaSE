package day06.mypac;

public class HandPhone {
	public String model;  //�������� �ʱ�ȭ ���� ���� null
	
	static {
		System.out.println("static �ʱ�ȭ ��");
		
	}
	{
		System.out.println("�ʱ�ȭ ��");
	}
	
	// ������
	public HandPhone() {
		this.model = "������";
		System.out.println("�����ڰ� ȣ�� �Ǿ����ϴ�.");
	}
	
	// �����ε� ������
	public HandPhone(String model) {
		this.model = model;
		System.out.println("�����ε� �����ڰ� ȣ�� �Ǿ����ϴ�.");
	}
	
}
