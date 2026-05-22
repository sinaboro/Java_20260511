package ex;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		while(true) {
			if(num2 == 0) {
				System.out.println("분모는 0이 될수 없습니다.");
				System.out.println("다시 입력하세요");
				num2 = sc.nextInt();
			}else {
				break;
			}
		}
		
		System.out.println("나누기 결과: " + num1/num2);
		
		
		System.out.println("프로그램 종료!");

	}

}
