package ex01;

/*
 * 함수
 * 두 정수를 입력받아서 , 합을 구하는 예제
 * 1. 전달하는 값(인자, 매개변수), 반환받는 값
 */
public class FunctionEx03 {

	public static void main(String[] args) {		
		
		int a = 3;
		int b = 2;
				
		int total = add(a,b);
		System.out.println("두 수 합 : " + total);
	}
	
	static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
