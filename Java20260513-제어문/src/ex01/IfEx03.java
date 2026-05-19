package ex01;

/*
 * 1. 조건식이 참이면 문장을 실행
 *    if(조건식)
 *      문장;
 * 
 * 2. 조건식이 참이면 문장1을 실행 거짓이면 문장2를 실행
 *    if(조건식)
 *       문장1;
 *    else
 *       문장2;
 *       
 * 3. 조건식1이 참이면 문장1을 , 조건식2가 참이면 문장2를 그 외는 문장3
 *    if(조건식1)
 *       문장1;
 *    else if(조건식2)
 *       문장2;
 *    else
 *       문장3;      
 *      
 * 
 */
public class IfEx03 {

	public static void main(String[] args) {
		
		int jumsu = -5;
		
		if(jumsu >= 90) {
			System.out.println("A학점");
	   	    System.out.println("공부잘했네...");
		}
		else if(jumsu >= 80) {
			System.out.println("B학점");
		}
		else if(jumsu >= 70) 
			System.out.println("C학점");
		else if(jumsu >= 60)
			System.out.println("D학점");
		else 		
			System.out.println("F학점");
					
		System.out.println("프로그램 종료!!");

	}

}









