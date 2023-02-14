package day10.lang;
/*
 *  [[ String Class ]]
 *   ���ڿ��� �ٷ�� Ŭ����
 * 	 �Һ�(immutable)�� ��ü - �޸𸮿��� ���ڿ� ���� ������� �ʴ´�.
 * 	 1. �޸� ����
 * 	 2. Security UP
 * 	 3. Thread Safe
 */

public class MainClass04 {
	public static void main(String[] args) {
		String str1 = "abc";   // �Һ�
		String str2 = "abc";   // �Һ�
		String str3 = new String("abc");   // ���ο� �޸�
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str1 = "def";
		System.out.println(System.identityHashCode(str1));
		
		// ���ڿ� ���� length
		String txt = "ABCDEFGHIJK";
		System.out.println("length :" + txt.length());
		
		// ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ�
		String str4 = "apple";
		boolean startWith = str4.startsWith("a");
		System.out.println("startWith:" + startWith);
		
		// ���ڿ� �������� ������ ���ڰ� �ִ��� �Ǵ�
		String str5 = "text";
		boolean endWith = str5.endsWith("t");
		System.out.println("endWith :" + endWith);
		
		//���� �ε�����ȣ ��ȯ
		String str6 = "abcdef";
		int indexOf= str6.indexOf("d");
		System.out.println("indexOf :" + indexOf);
		
		// ���ڿ��� ������ ���ڰ� ������ ���°�� �ִ��� int�� ��ȯ�Ѵ�.
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
		
		// ���� ġȯ
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace:" + replace);
		
		// ���ڿ� ������(�迭�� ��ȯ)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		for(int i=0; i < split.length; i++) {
			System.out.println("split["+i+"] : " + split[i]);
		}

		// ���ڿ� ����
		String str10 = "ABCDEF";
		String substring = str10.substring(0,2);
		System.out.println("substring:" + substring);
		
		// �ҹ��� ��ȯ
		String str11 = "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase :" + toLowerCase);
		
		// �빮�� ��ȯ
		String str12 = "abcDEF";
		String toUpperCase = str12.toUpperCase();
		System.out.println("toUpperCase : " + toUpperCase);
		
		// ��������
		String s = "    java java java     ";
		String v = s.trim();
		System.out.println("trim:" + v);
		
		// ��������2
		String s2 = "     java java java    ";
		String v2 = s2.replace(" ", "");
		System.out.println("replace�� �������� : " + v2);
		
		// ���ں�
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		System.out.println("compareTo :" + compareTo);
		if(compareTo > 0) {
			System.out.println(str13 + " > " + str14);
		}else if (compareTo ==0) {
			System.out.println(str13 + " = " + str14);
		}else {
			System.out.println(str13 + " < " + str14);
		}
		
		// ���� ���Կ���
		String str15 = "abcd";
		String str16 = "c";
		boolean contains = str15.contains(str16);
		System.out.println("contains :" + contains);
		
		// ���ڿ� �߰� ������ �� �ַ� ����ϴ� �ڷ���
		// Thread Safe
		StringBuffer sb = new StringBuffer();
		// ���ڿ��߰�
		sb.append("abc");
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		// Thread safe �ƴϴ�.
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		
	} 
}
