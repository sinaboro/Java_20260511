package ex01;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		 * 5명 학생 국어 점수를 입력받아서 출력
		 */
		//int a = 10;
		int a =  (int)(Math.random()*100) + 1; //1~100
		int b =  (int)(Math.random()*100) + 1;
		int c =  (int)(Math.random()*100) + 1;
		int d =  (int)(Math.random()*100) + 1;
		int e =  (int)(Math.random()*100) + 1;
		
		System.out.println("1번째 학생 : " + a);
		System.out.println("2번째 학생 : " + b);
		System.out.println("3번째 학생 : " + c);
		System.out.println("4번째 학생 : " + d);
		System.out.println("5번째 학생 : " + e);

	}

}
