package day07.mypac;

public class Animal {

	
	public String name;
	//private = Animal Ŭ���� �ȿ����� ����
	// ������ �������� ���� ���� get set�޼ҵ� �̿�
	
	//set�޼ҵ� - �� �����ϱ�
	// �̸� �����ֱ�
	public void setName(String name) {
		this.name = name;
	// this: �ڱ� �ڽſ� �ִ� ���, �� �� Ŭ���� �ȿ� ���������� ���ӵǾ� �ִ� ����
	}
	
	// get�޼ҵ� - �� �ҷ�����
	public String getName() {
		return name;
	}
	
	// �����δ�.
	public void move() {
		System.out.println("�����δ�.");
	}
}
