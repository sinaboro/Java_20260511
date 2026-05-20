package ex02;

/*
 * 주사위 던저기 게임
 * 주사위를 던져서 누적해서 합이 높은 사람이 승자
 * 단, 주사위 6이 나오면 게임 종료
 */

public class BreakExam01 {

	public static void main(String[] args) {
		
		// 주사위 숫자의 총합을 저장할 변수
		int sum = 0;

		// 무한 반복
		while(true) {			
			
			// 1 ~ 6 사이의 랜덤 숫자 생성
			// Math.random() : 0.0 ~ 0.999...
			// * 6 : 0 ~ 5.xxx
			// +1 : 1 ~ 6
			int num = (int)(Math.random()*45) + 1;  
			
			// 나온 주사위 값을 sum에 누적
			// sum = sum + num;
			sum += num;  
			
			// 만약 주사위 값이 6이면 반복 종료
			if(num == 6)
				break;
			
			// 현재 나온 주사위 값과 누적 합 출력
			System.out.println("주사위 : " + num + " 합 : " + sum
			);
		}

	}

}
