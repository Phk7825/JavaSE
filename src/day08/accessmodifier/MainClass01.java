package day08.accessmodifier;

import day08.mypac.CellPhone;
import day08.mypac.Phone;
import day08.mypac2.SmartPhone;

/*
 * 
 * [[ ���������� ]]
 * 		public - ��� Ŭ�������� ���� ����
 * 		protected - ���� ��Ű�� �Ǵ� ��� ���迡�� ���ٰ���.
 * 		default - ���� ��Ű�� ���� ����.
 * 		private - ���� Ŭ���� �ȿ��� ���� ����.
 * 		 
 */



public class MainClass01 {
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		CellPhone cellphone = new CellPhone();
		day08.mypac2.SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("�𵨸�: " + phone.model);
		System.out.println("�𵨸�: " + cellphone.model);
		System.out.println("�𵨸�: " + smartPhone.getModel());
		
		smartPhone.videoMessage();
	}
}
