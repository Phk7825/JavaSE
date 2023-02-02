package day06.var;

import day06.mypac.Card;

/*
 * [[���� (variable) ]]
 *  �޸� ������ �ٿ��� �̸�.
 *  JAVA ���α׷� ���Ǵ� ��� ���� �޸� ������ ����.
 *  �޸� ������ �̸��� �ٿ� ���ٰ���.
 *  
 *  ���� ���� �� �ʱ�ȭ
 *  �ڷ��� ������ = ��
 *  
 *  
 *  1. Ÿ���� ���� ����
 *  	�⺻�� - 
 *  		8���� boolean, byte, short, char, int, long, float, double
 *  	������ - �빮�ڷ� ������ �ϰ�, �ּҰ��� ������ �ִ�.
 *  	  	�⺻�� �� ������ ����!
 *  		ex) String
 *  
 *  2. ���� ��ġ�� ���� ����
 *  	��������(method ��) - Ŭ���� �ȿ� ����(�������)
 *     					     �ʱ�ȭ ���� ������ default ���� ����.
 *     				       boolean - false
 *     						������  - 0
 *  						 �Ǽ��� - 0.0
 *  						������ = null
 *  
 *  	��������(method �ٱ�) - �޼ҵ� �Ǵ� ������ �ȿ� ����
 *  						�߰�ȣ{} �ȿ� ����� ���� �Ǵ� �Ű�����.
 *  						�ݵ�� �ʱ�ȭ ����� �Ѵ�!! (������ ����)
 *  
 *  3. ����(static) / ���� ����
 *  	���� - static ���� �������
 * 			   ��� ��ü�� �����Ѵ�.
 * 			   Ŭ���������� ���� ����.
 * 		���� - static�� �ƴ� �Ϲ� �������
 * 
 */
public class MainClass01 {
		public static void main(String[] args) {
			Card card1 = new Card();
			Card card2 = new Card();
			Card card3 = new Card();
			
			card1.type ="Diamond";
			card2.type ="Heart";
			System.out.println(card1.type);
			System.out.println(card2.type);
			System.out.println(card3.type);
			
			card1.width = 124;
			card2.height = 176;
			System.out.println(card1.width);
			System.out.println(card1.height);
			System.out.println(card2.width);
			System.out.println(card2.height);
			System.out.println(card3.width);
			System.out.println(card3.height);
			
			card3.type = "Clover";
			System.out.println(card1.type);
			System.out.println(card2.type);
			System.out.println(card3.type);
			
		}

}
