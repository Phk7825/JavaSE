package day07.mypac;

public class Student extends People {
	public int korScore;
	public int mathScore;
	public int engScore;

	
	// ������ - ���ϰ��� ����.
	// 		   ��ü ������ �ѹ��� ����ȴ�. 
	public Student(String name, int age, int korScore, int mathScore, int engScore) {
		
		super.name = name;
		super.age = age;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;			
	}
	
	public void printMyScore() {
		System.out.println("��������: " +korScore);
		System.out.println("��������: " +mathScore);
		System.out.println("��������: " +engScore);	
	}
}
