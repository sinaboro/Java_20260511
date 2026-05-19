package ex08;

public class Student {

	/*
	 * 인스턴스변수, 멤버변수
	 * 객체마다 개별적으로 생성
	 */
	private String name;
	private int score;
	
	/*
	 * 클래스 변수, 정적변수, static변수
	 * 객체들이 공통으로 사용
	 */
	static int studentCount = 0;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		
		//학생 생성될 때마다 증가
		studentCount++;
	}
	
	/*
	 * 인스턴스 메소드
	 * 객체마다 개별적으로 동작
	 */
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
	}
	
	/*
	 * 클래스 메소드(정적메소드)
	 * 객체 생성 없이 사용 가능
	 */
	static void showStudentCount() {
		System.out.println("전체 학생 수 : " + studentCount);
	}
	
}
