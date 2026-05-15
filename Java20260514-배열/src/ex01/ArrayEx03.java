package ex01;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*
		 * 5명 학생 국어 점수를 입력받아서 출력
		 */
		
		int[] kor = new int[5];
		
		for(int i=0; i<5; i++)
			kor[i] =  (int)(Math.random()*100) + 1; //1~100
		
		for(int i=0; i<5; i++)
			System.out.println((i+1) + "번째 학생 : " + kor[i]);
		
		int sum=0;
		// 5명학생 총점 구하기
		for(int i=0; i<5; i++)  //i > 0,1,2,3,4
			sum += kor[i];
		
		System.out.println("총점 : " + sum);
		
		//sum += i
				
	}

}
