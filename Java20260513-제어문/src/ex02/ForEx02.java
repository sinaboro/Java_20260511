package ex02;

/*
 * 반복문
 * 1. for, 
 * 2. while
 * 3. do~while
 * 
 * for VS while -> 조건이 참이면 실행, 거짓이면 실행안함
 * do~while -> 최소 1번을 실행보장(거짓이여도 한번은 실행) 
 * 
 * for :
 * 
 * for(초기값; 조건; 증가값)
 * 	조건을 만족하면 실행될 코드(문장)
 * 
 * 실행순서 :
 * 1회전 : 초기값 -> 조건-> 문장 -> 증가값
 * 2회전이후 :
 * 	조건 -> 문장 -> 증가값 ; 반복(조건 만족할 동안)
 */
public class ForEx02 {

	public static void main(String[] args) {
		/*
		 * 1~100: 짝수 합
		 */
		int sum = 0;
		
		/*
		i=10
		e = i++; // e(10) i(11)
		a = ++i; //a(12), i(12)
		*/
		
		for(int i=0; i<=100; i++) {
			//1, 2,3,4,5,6,7,8,9,10
			
			//if(i % 2 != 1)
			if(i % 2 == 0)
			   sum += i;	
		}
		
		System.out.println("총합 : " + sum);
	}

}
