package day07.interfaceEx;

import day07.mypac.AkWeapon;

/*
 * [[ �������̽� (interface) ]]
 * 	�߻�޼ҵ常 �����Ѵ�.
 *  ���������� �ص� ������ �ƴ� ����� �ȴ�.
 *  ���� ��� ����!
 *  
 *  ��ü ����(����)�� ������ش�
 * 
 */



public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak47 = new AkWeapon();
		ak47.attack();
		System.out.println(ak47.NAME);
		ak47.doSnip();
	}
}
