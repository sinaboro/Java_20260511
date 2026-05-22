package ex;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 지역 입력: ");
		String name = sc.nextLine();
		String local = sc.nextLine();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + local);
		
		
		
		System.out.println("프로그램 종료!");

	}

}
