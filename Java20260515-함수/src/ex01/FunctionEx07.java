package ex01;

public class FunctionEx07 {

	public static void main(String[] args) {
		
		int result1 = add(10,2);
		System.out.println(result1);
		
		int result2 = thrid(10,5,9);
		System.out.println(result2);

		int result3 = four(10, 5, 9, 5);
		System.out.println(result3);

		double result4 = dadd(1.2 , 5.2);
		System.out.println(result4);
		
	}	
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double dadd(double a, double b) {
		return a+b;
	}
	
	static int thrid(int a, int b,int c) {
		return a+b+c;
	}
	
	static int four(int a, int b,int c, int d) {
		return a+b+c+d;
	}
}
