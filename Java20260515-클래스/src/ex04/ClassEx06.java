package ex04;

/*
 * 학생 성적처리 프로그램
 * 이름, 국어, 영어, 수학 입력받아서
 * 총점 , 평균을 구하는 클래스 설계
 */
public class ClassEx06 {

	public static void main(String[] args) {
			
		Student st1 = new Student("이순신", 79, 45, 99);
		
		
		
		System.out.println(st1.getName() + ": ");
		System.out.println("총점 : " + st1.total());
		System.out.println("평균 : " + st1.avg());
		
		Student st2 = new Student("홍길동", 66, 34, 67);
				
		System.out.println(st2.getName() + ": ");
		System.out.println("총점 : " + st2.total());
		System.out.println("평균 : " + st2.avg());
	}
}

class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String n, int k, int e, int m) {
		name = n; 	
		kor = k; 
		eng = e;  
		math = m;
	}
	
	String getName() {
		return name;
	}
	//총점구하는 함수
	int total() {
		int sum = kor+eng+math;
		return sum;
	}
	
	//평균 구하는 함수
	double avg() {
		double average = total()/3.0;
		
		return average;
	}
}











