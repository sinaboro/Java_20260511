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
public class IfEx01 {

	public static void main(String[] args) {
		
		int age = 15;
		
		if(age >= 20)
			System.out.println("당신은 성인입니다.");
		
		System.out.println("프로그램 종료!!");

	}

}
