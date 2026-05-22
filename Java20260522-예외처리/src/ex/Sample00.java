package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample00 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (true) {

            try {

                // 첫 번째 정수 입력
                System.out.print("첫 번째 정수 입력 : ");
                num1 = sc.nextInt();

                // 두 번째 정수 입력
                System.out.print("두 번째 정수 입력 : ");
                num2 = sc.nextInt();

                // 나누기
                int result = num1 / num2;

                // 결과 출력
                System.out.println("나누기 결과 : " + result);

                // 정상 실행 시 반복 종료
                break;

            } catch (Exception e) {

                System.out.println("정수만 입력 가능합니다.");

                // 잘못 입력된 값 제거
                sc.nextLine();

            } 
        }

        System.out.println("프로그램 종료");
        sc.close();
	}

}
