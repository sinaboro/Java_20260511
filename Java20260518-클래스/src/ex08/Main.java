package ex08;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("까미", 95);
		Student s2 = new Student("로이", 85);
		Student s3 = new Student("뽀양", 77);
		Student s4 = new Student();
		

		s1.showInfo();
		
		System.out.println();
		
		s2.showInfo();
		
		//클래스 메소드 호출
		Student.showStudentCount();
		
	}

}
