package ex03;

/*
 * 학생 성적처리 프로그램
 * 이름, 국어, 영어, 수학 입력받아서
 * 총점 , 평균을 구하는 클래스 설계
 */
public class ClassEx05 {

	public static void main(String[] args) {
			
		Student st1 = new Student();
		
		st1.name = "홍길동";
		st1.kor = 90;
		st1.eng = 91;
		st1.math = 75;
		
		System.out.println(st1.name + ": ");
		System.out.println("총점 : " + st1.total());
		System.out.println("평균 : " + st1.avg());
		
		Student st2 = new Student();
		
		st2.name = "이순신";
		st2.kor = 70;
		st2.eng = 41;
		st2.math = 35;
		
		System.out.println(st2.name + ": ");
		System.out.println("총점 : " + st2.total());
		System.out.println("평균 : " + st2.avg());
	}
}

class Student {
	String name;
	int kor;
	int eng;
	int math;
	
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
