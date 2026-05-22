package ex;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 나이 입력: ");
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
		
		
		System.out.println("프로그램 종료!");

	}

}
