package ex01;

/*
 * 함수
 * 두 정수를 입력받아서 , 합을 구하는 예제
 * 
 * 3. 매개변수없고, 반환값도 없는 경우
 */
public class FunctionEx06 {

	public static void main(String[] args) {		
		
		add(); //함수 호출, function call
		System.out.println("프로그램 종료!!");
	}
	
	static void add() {
		
		int a = 5;
		int b = 2;
		
		int sum = a+b;
		
		System.out.println("두 수 합 : " + sum);
		
	}

}
