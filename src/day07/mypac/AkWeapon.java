package day07.mypac;

public class AkWeapon implements Weapon, Scope {

	@Override
	public void attack() {
		System.out.println("���� ������ �ؿ�!");
	}	
	@Override
	public void doSnip() {
		System.out.println("������ �ؿ�!");
	}
}
