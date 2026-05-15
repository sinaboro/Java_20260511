package ex01;

/*
 *  1. 배열 10개 방에 랜덤하게 1~100사이 값을 저장
 *  2. 배열에서 최대값 , 최소값 구하기
 *  3. 배열 값 총점/평균 구하기
 *  4. 배열 값 정렬(오름차순)
 */
public class ArrayEx05 {

	public static void main(String[] args) {
			
		//1. 배열 10개 방에 랜덤하게 1~100사이 값을 저장
		
		int[] number = new int[10];
		
		System.out.println("값 저장 > ");
		for(int i=0; i<number.length; i++)
			number[i] = (int)(Math.random()*100) + 1;
		
		for(int i=0; i<number.length; i++)
			System.out.print(number[i] + " ");
		
		System.out.println();  // 줄변경
		
		//2. 배열에서 최대값 , 최소값 구하기
		//int max= 0;
		int max = number[0];
		int min = number[0];
		for(int i=0; i<number.length; i++) {
			
			if(max < number[i])
				max = number[i];
			
			if(min > number[i])
				min = number[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		// 3. 배열 값 총점/평균 구하기
		int sum = 0;
		double avg = 0;
		for(int i=0; i<number.length; i++) {
			sum += number[i];  //sum = sum + number[i]
		}
		avg = (double)sum/number.length;  //평균
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		//4. 배열 값 정렬(오름차순)
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number.length-1; j++) {
				if(number[j] > number[j+1]) {
					int tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<number.length; i++)
			System.out.print(number[i] + " ");
		
	}

}




















