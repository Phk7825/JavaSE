package day07.mypac;

public class PersianCat extends Cat{
	
	@Override	// �θ� �޼ҵ� ������
	public void move() {
		System.out.println("����ϰ� �����δ�.");
		super.move();
		//super�� ����ϸ� ����Ŭ������ ����� ���� ����Ѵ�.
	}
	
	
	public void getColor() {
		System.out.println("�Ͼ��!!");
	}
}
