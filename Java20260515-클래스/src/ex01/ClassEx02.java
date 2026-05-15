package ex01;

/*
 * 학생 정보 관리 프로그램
 */
public class ClassEx02 {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		int age1 = 20;
		String phone1 = "010-1111-2222";
		
		String name2 = "이순신";
		int age2 = 30;
		String phone2 = "010-2222-3333";
		
		String name3 = "유관순";
		int age3 = 18;
		String phone3 = "010-4444-5555";
		
		MemberInfo(name1, age1, phone1);
		System.out.println("--------------");
		MemberInfo(name2, age2, phone2);
		
		System.out.println("--------------");
		MemberInfo(name3, age3, phone3);
		
		
	}
	
	/*
	 * 함수이름: MemberInfo
	 * 매개변수: 문자열, 정수, 문자열
	 * 반환타입: X
	 */
	static void MemberInfo(String name, int age, String phone) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
	}

}
