package ex01;

public class SampleEx {

	public static void main(String[] args) {
		
		//자료형 , 변수
		int age = 0;  //변경 가능 변수
		  
		final double PI = 3.14159;  //변경 불가, 상수화 
		
				
		age = age+1;
		
		System.out.println("Hello, Java 21!");
		
		/*
		 * 형변환
		 * 자동형변환, 강제 형변환 
		 * 자동형변환 -> 작은자료형을 큰 자료형 대입(값 손실 없음)
		 * 강제형변환 -> 큰 자료형을 작은 자료형 대입(값 손실 가능성 존재)
		 */
		
		double ex = 1.2 + 10;
		
		double douD  = 10.1;
		float f1 = 10.1f;
		
		int intA = 10;
		int b = 3;
	
		//a = d1; 
		
		douD = intA;   
		
		//f1 = d1;
		f1 =  (float)douD;
		
		System.out.println(intA/b);
		System.out.println(intA/(double)b);
		
		
		int intB ;
		long longA = 2500000000L;
		
		intB = (int)longA;
		System.out.println(intB);
		System.out.println(longA);
		
		
	}

}
