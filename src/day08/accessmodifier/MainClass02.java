package day08.accessmodifier;

import day08.vo.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("abcd");
		memberVO.setPassword("abcd123!@#");
		memberVO.setName("���ĺ�");
		memberVO.setPhonenumber("01012345678");
		memberVO.setEmail("abc@abcd.com");
		memberVO.setAddress("����Ư���� ���ǵ�");
		memberVO.setBirth("970312");
		
		System.out.println("ID:" + memberVO.getId());
		System.out.println("�н�����:" + memberVO.getPassword());
		
		
	}
	
}


/*package day08.accessmodifier;

import java.security.NoSuchAlgorithmException;

import day08.vo.MemberVO;

public class MainClass02 {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("abcd");
		memberVO.setPassword("abcd123!@#");
		memberVO.setName("���ĺ�");
		memberVO.setPhoneNumber("01012345678");
		memberVO.setEmail("abc@abcd.com");
		memberVO.setAddress("����Ư���� ���ǵ�");
		memberVO.setBirth("970312");
		
		
		System.out.println("ID : " + memberVO.getId());
		System.out.println("�о����� : " + memberVO.getPassword());
		
		
	}
}
*/
