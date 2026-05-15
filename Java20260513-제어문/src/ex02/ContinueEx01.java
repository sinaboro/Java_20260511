package ex02;

public class ContinueEx01 {

	/*
	 *  1 ~ 10 출력
	 *  단, 3의 배수를 출력하지않는다
	 *  출력 예시 -> 1,2,4,5,7,8,10
	 */
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i % 3 == 0 )
				continue;
				
			System.out.println(i);
		}
	}

}
