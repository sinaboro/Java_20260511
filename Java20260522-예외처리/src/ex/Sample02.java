package ex;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine(); //엔터가 치워라
		
		String name = sc.nextLine();
		
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		
		
		
		System.out.println("프로그램 종료!");

	}

}
