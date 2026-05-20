package ex01;

public class ArrayEx03_1 {

	public static void main(String[] args) {
		/*
		 * 5명 학생 국어 점수를 입력받아서 출력
		 */
		
//		int[] kor = new int[5];
		int[] kor = {90,60,77,33, 78};
		
		
		
		for(int i=0; i<5; i++)
			System.out.println((i+1) + "번째 학생 : " + kor[i]);
		
		
				
	}

}
