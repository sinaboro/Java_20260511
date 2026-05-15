package ex01;

public class Sample {

	public static void main(String[] args) {
		
		int num1 = 100;		
		int num2 = 200;
		
		System.out.println("before >>");
		System.out.println("num1 = " + num1 + " , num2 = " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("after >>");
		System.out.println("num1 = " + num1 + " , num2 = " + num2);
		
		

	}

}
