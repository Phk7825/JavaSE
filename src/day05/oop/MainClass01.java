package day05.oop;

import day05.mypac.Card;

/*
 *  OOP(Object Oriented Programming) - ��ü���� ���α׷���
 *  
 * [[ ��ü(object)�� ]]
 *  ���������� �����ϰų� �߻������� ������ �� �ִ� �� �߿���
 *  ���ǰ���, �ĺ� �����Ѱ��� ���Ѵ�.
 *  
 * ��) �������� �� - �����, ��ǻ��, �ڵ���, �޴���, �л�, ȸ��
 *     �߻����� �� - �ֹ�, ȸ��, ����, �ֽ�
 * 
 * �ڹٿ����� �ּ����� ���α׷� ����
 * 
 * ��ü�� ����� ���ؼ��� ����(���� Ʋ) �Ǵ� ���赵 => Class
 * 
 * Class�� �ۼ��� �ڵ带 �о� ��üȭ �Ѵ� => �޸𸮿� �ø���!!
 *
 * Ŭ���� ���� 
 * Class Ŭ������ (extend ���) (implements �������̽����){
 * 	(������) =>  �ʱ�ȭ
 * 	����	   =>  �Ӽ� ��
 * 	�޼ҵ�    =>  ���
 * }
 * 
 * ��üȭ
 * Ŭ������ ������ = new Ŭ������();
 * 
 * ��ü �������
 * 	������     =>  �ʱ�ȭ
 * 	����	   =>  �Ӽ� ��
 * 	�޼ҵ�     =>  ��� 
 */

public class MainClass01 {
	public static void main(String[] args) {
		Card card = new Card();
		
		System.out.println(card.type);
		System.out.println(card.number);
		
		card.number = "10";
		System.out.println(card.number);
		
	}
}


//new: �޸𸮿� �ø���