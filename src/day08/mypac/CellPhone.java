package day08.mypac;

public class CellPhone extends Phone {
	public String model;
	
	public CellPhone() {
		this.model = "�޴�� ��ȭ��";
	}
	
	protected void sendMessage() {
		System.out.println("���� ������.");
	}
}
