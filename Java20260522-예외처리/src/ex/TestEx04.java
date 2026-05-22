package ex;

import java.io.FileReader;
import java.io.IOException;

public class TestEx04 {
	public static void main(String[] args) {
		method1();
		System.out.println("1");
	}
	
	static void method1() {
		method2();
		System.out.println("2");
	}
	
	static void method2() {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("3");
		
	}
}
