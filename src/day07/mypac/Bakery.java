package day07.mypac;


/*
 * TODO ����
 * 1 ������
 * 2 ����ũ����
 * 3 ����
 * 
 * 3. ������
 * 4. ī��
 * 5. ī��Ʈ
 * 
 */

public class Bakery {
	// ���� ��ü
	public Bread[] bread;
	
	// ����ũ�� ��ü
	public Cake[] cake;
	
	// Ŀ�Ƿ� ��ü
	public Coffee[] coffee;
	
	public Bakery(Bread[] bread, Cake[] cake, Coffee[] coffee) {
		this.bread = bread;
		this.cake = cake;
		this.coffee = coffee;
		System.out.println("���� �����Ͽ����ϴ�.");
	}
	
	public static void main(String[] args) {
		CreamBread cb = new CreamBread();
		RedBeanBread rbb = new RedBeanBread();
		
		
		ChocoCake cc = new ChocoCake();
	//	System.out.println("����ũ �̸�: " + cc.cakeName);
	//	System.out.println("����ũ ����: " + cc.cakePrice);
		
		Bread[] breadArray = new Bread[2];
		breadArray[0] = cb;
		breadArray[1] = rbb;
		
		Cake[] cakeArray = new Cake[1];
		cakeArray[0] = cc;
		
		Bakery parisBaguette = new Bakery(breadArray, cakeArray, null);
		
		for(Bread bread: parisBaguette.bread) {
			System.out.println(bread.breadName+" ����: " + bread.breadPrice + "�� �Դϴ�.");
		}
		
		for(int i=0; i <parisBaguette.bread.length; i++) { //���� for���� ����
			Bread bread = parisBaguette.bread[i];
			System.out.println(bread.breadName+" ����: " + bread.breadPrice + "�� �Դϴ�.");
		}
		
		for(Cake cake: parisBaguette.cake) {
			System.out.println(cake.cakeName+" ����: " + cake.cakePrice + "�� �Դϴ�.");
		}
		
	//	Bakery bakery = new Bakery(cb, cc, null);
		
	//	CreamBread bakeryCreamBread = (CreamBread) bakery.bread;
		
	//	System.out.println("�� �̸� : " + bakeryCreamBread.breadName);
	//	System.out.println("�� ���� : " + bakeryCreamBread.breadPrice);
	}
	
}
