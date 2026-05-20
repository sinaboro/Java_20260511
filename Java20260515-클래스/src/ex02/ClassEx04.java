package ex02;

/*
 * 학생 정보 관리 프로그램
 */
public class ClassEx04 {

	public static void main(String[] args) {
		
		//객체 생성, 인스턴스 생성
		Member hong = new Member("홍길동", 20, "010-1111-2222"); 
		hong.memberInfo();
		
		Member lee = new Member("이순신", 20, "010-2222-3333");
		
		lee.memberInfo();
		
		Member kim = new Member();
		kim.memberInfo();
	}
}

/*
 * 클래스는 
 *    변수(멤버변수)
 *    메소드(함수)
 * 멤버변수 앞에 private붙이면 그 멤버변수는 외부공개안함
 * 내부 클래스에서만 사용가능
 * 멤버변수는 외부 공개 안하는 것이 원칙 
 */
class Member{
	private String name;
	private int age;
	private String phone;	
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	//생성자 -> 멤버변수 초기화 용도
	public Member(String n,int a, String p) {
		name = n;
		age = a;
		phone = p;		
	}	
	
	void memberInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phone);
	}
}