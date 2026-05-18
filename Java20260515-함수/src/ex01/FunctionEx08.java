package ex01;

/*
 * 함수 이름 중복 -> 함수 오버로딩
 * 
 * 함수 오버로딩 조건
 *  - 반환타입은 상관없음
 *  - 함수명 중복
 *  - 매개변수 갯수나 타입(자료형) 틀리면 성립
 */
public class FunctionEx08 {

	public static void main(String[] args) {
		
		int result1 = add(10,2);
		System.out.println(result1);
		
		int result2 = add(10,5,9);
		System.out.println(result2);

		int result3 = add(10, 5, 9, 5);
		System.out.println(result3);

		double result4 = add(1.2 , 5.2);
		System.out.println(result4);
		
	}	
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static int add(int a, int b,int c) {
		return a+b+c;
	}
	
	static int add(int a, int b,int c, int d) {
		return a+b+c+d;
	}
}
