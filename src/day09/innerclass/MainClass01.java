package day09.innerclass;

/* [[ ���� Ŭ���� InnerClass) ]]
 * 	Ŭ���� �ȿ� �� �ٸ� Ŭ���� ����
 * 	Ŭ������ �ٸ� Ŭ������ �����ϴ� ������ �� Ŭ������ ����� ���� �����̴�.
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
		
	}// main �޼ҵ� End
	
	static class InnerClass {
		public void doSomething() {
			System.out.println("���𰡸� �ؿ�!");
		}
	}	// InnerClass End
}	// MainClass01 End
