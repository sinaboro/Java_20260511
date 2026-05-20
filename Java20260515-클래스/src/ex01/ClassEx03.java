package ex01;

/*
 * 학생 정보 관리 프로그램
 */
public class ClassEx03 {

	public static void main(String[] args) {
		
			
		//객체 생성, 인스턴스 생성
		Member hong = new Member(); 
		hong.name = "홍길동";
		hong.age = 20;
		hong.phone = "010-1111-2222";
		hong.memberInfo();
		
		Member lee = new Member();
		lee.name = "이순신";
		lee.age = 30;
		lee.phone = "010-2222-3333";
		lee.memberInfo();
	}
}

/*
 * 클래스는 
 *    변수(멤버변수)
 *    메소드(함수) 
 */
class Member{
	String name;
	int age;
	String phone;	
	
	void memberInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
	}
}




















