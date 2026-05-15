package ex01;

public class IfEx05 {

	public static void main(String[] args) {
		
		/*
		 * 국어, 영어 점수가 각각 60이상이면 합격
		 * 아니면 불합격
		 * 
		 * ==> 중첩 if
		 */
		
		int kor = 70;
		int eng = 67;
		
		if(kor>=60) {
			if(eng>=60)
				System.out.println("합격");
			else
				System.out.println("불합격");
				
		}		
		else
			System.out.println("불합격");
		
					
		System.out.println("프로그램 종료!!");

	}

}
