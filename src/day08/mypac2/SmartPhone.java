package day08.mypac2;


// alt +shift+s = get set ����
import day08.mypac.CellPhone;

public class SmartPhone extends CellPhone{
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public SmartPhone() {
		this.model = "����Ʈ��";
	}
	
	public void internet() {
		System.out.println("���ͳ��� �ؿ�.");
		
	}
	
	public void videoMessage() {
		System.out.println("����");
		sendMessage();
	}
	
	
}
