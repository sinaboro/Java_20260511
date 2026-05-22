package ex08;

public class Student {

	private String name;
	private int score;
	static int studentCount = 0;
	
	public Student() {}
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		//학생 생성될 때마다 증가
		studentCount++;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
	}
	
	void showStudentCount() {
		System.out.println("전체 학생 수 : " + studentCount);
	}
	
}
