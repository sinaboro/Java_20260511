package ex01;

/*
 * 함수
 * 두 정수를 입력받아서 , 합을 구하는 예제
 * 2. 전달하는 값(인자, 매개변수), 반환값은 없는 경우
 */
public class FunctionEx04 {

	public static void main(String[] args) {		
		
		double a  =  1.2;
		double b  = 2.5;
		
		add(a,b);
	}
	
	static void add(double num1, double num2) {
		
		double sum = num1 + num2;
		System.out.println("두 수 합 : " + sum);
		
		return ; //생략 가능
		
	}

}
