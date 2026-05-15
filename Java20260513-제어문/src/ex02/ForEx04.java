package ex02;


public class ForEx04 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 ~ 5단 출력
		 */
		
		//2 x 1 = 2
		//3 x 1 = 3
		for(int j=2; j<=9; j++) {
			
			for(int i=1; i<=9; i++) {
				System.out.println(j + " X " + i + " = " +  j*i);
				if(j == i)
					break;
			}
			
		}
		
		System.out.println("프로그램 종료!");
	}

}
