package ex01;

/*
 * 함수
 * 두 정수를 입력받아서 , 합을 구하는 예제
 * 
 * 3. 전달하는 값 없고, 반환값은 있는 경우
 */
public class FunctionEx05 {

	public static void main(String[] args) {		
		
		int result = add();
		
		System.out.println("두 수 합 : " + result);
	}
	
	static int add() {
		
		int a = 5;
		int b  = 2;		
		
		return a+b; 
		
	}

}
