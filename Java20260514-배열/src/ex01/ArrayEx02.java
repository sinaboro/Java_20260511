package ex01;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*
		 * 5명 학생 국어 점수를 입력받아서 출력
		 */
		
		int[] kor = new int[5];
		
		kor[0] =  (int)(Math.random()*100) + 1; //1~100
		kor[1] =  (int)(Math.random()*100) + 1;
		kor[2] =  (int)(Math.random()*100) + 1;
		kor[3] =  (int)(Math.random()*100) + 1;
		kor[4] =  (int)(Math.random()*100) + 1;
		
		System.out.println("1번째 학생 : " + kor[0]);
		System.out.println("2번째 학생 : " + kor[1]);
		System.out.println("3번째 학생 : " + kor[2]);
		System.out.println("4번째 학생 : " + kor[3]);
		System.out.println("5번째 학생 : " + kor[4]);
	}

}
