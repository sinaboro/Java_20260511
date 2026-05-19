package ex01;

public class IfEx06 {

	public static void main(String[] args) {
		
		/*
		 * 관계 연산자
		 * 
		 * && , || , !
		 * 국어, 영어 점수가 각각 60이상이면 합격
		 * 아니면 불합격
		 * 
		 *  문장 그리고 문장  -> a 그리고 b    &&
		 *  문장 (또는, 혹은) 문장 -> a 혹은 b   ||
		 */
		
		int kor = 60;
		int eng = 87;
		
		if(kor >= 60 && eng >= 60) 
			System.out.println("합격");
				
		else 
			System.out.println("불합격");
		
					
		System.out.println("프로그램 종료!!");

	}

}
