package ex;

import java.io.FileReader;
import java.io.IOException;

public class TestEx05 {
	public static void main(String[] args){
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1");
	}
	
	static void method1() throws ClassNotFoundException {
		method2();
		System.out.println("2");
	}
	
	static void method2() throws ClassNotFoundException {
		
		Class.forName("java.lang.String2");
		
		System.out.println("3");
		
	}
}
