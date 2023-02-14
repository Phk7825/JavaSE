package day10.lang;

import day10.mypac.KPop;

public class MainClass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		KPop kpop1 = new KPop();
		KPop kpop2 = kpop1; // �ּҰ��� ����
							// call by reference
							// ���� ����
		// kpop1 �� kpop2�� �����ϴ�
		if(kpop1.equals(kpop2)) {
			System.out.println("kpop1 �� kpop2�� �����ϴ�");
		} else {
			System.out.println("kpop1 �� kpop2�� �ٸ��ϴ�");
		}
		kpop1.musicName = "abcedf" ;
		
		KPop kpop3 = (KPop) kpop1.callClone();
		System.out.println(kpop3.musicName);
		
		if(kpop1.equals(kpop3)) {
			System.out.println("kpop1 �� kpop3�� �����ϴ�");
		} else {
			System.out.println("kpop1 �� kpop3�� �ٸ��ϴ�");
		}
		
	}

}
