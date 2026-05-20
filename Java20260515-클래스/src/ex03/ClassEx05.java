package ex03;

/*
 * 학생 성적처리 프로그램
 * 이름, 국어, 영어, 수학 입력받아서
 * 총점 , 평균을 구하는 클래스 설계
 */
public class ClassEx05 {

	public static void main(String[] args) {
			
		Student st1 = new Student("홍길동", 90,91,75);
		
		System.out.println(st1.name + ": ");
		st1.total();
		st1.avg();
		
		Student st2 = new Student("이순신", 70, 41,35);
		
		System.out.println(st2.name + ": ");
		st2.total();
		st2.avg();
	}
}

class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	public Student() {	
	}
	
	public Student(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	//총점구하는 함수
	void total() {
		int sum = kor+eng+math;
		System.out.printf("총점 : %d\n" , sum );
	}
	
	//평균 구하는 함수
	void avg() {
		double average = (kor+eng+math)/3.0;
		
		System.out.printf("평균 : %.2f\n" , average);
	}
}






