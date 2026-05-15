package ex02;

/*
 * 1,2,3,4,5,6, 1식증가를 
 * sum 누적
 * 그때 sum합이 10000 넘는 순간에
 * i 값과 sum합을 출력
 */

public class BreakExam02 {

	public static void main(String[] args) {
		
		int i=0;
		int sum = 0;

		// 무한 반복
		while(true) {			
			i++;
			sum +=i;			

			System.out.println("i 값 : " + i + ", 총합 : " + sum);
			
			if(sum > 10000) 
				break;
			
		}

	}

}
