package ex04;

import java.util.Scanner;

public class VariableEx03 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);

        // 초 입력 받기
        System.out.print("초를 입력하세요: ");
        int totalSeconds = sc.nextInt();

        // 1시간 = 3600초
        int hour = totalSeconds / 3600;

        // 시간을 구하고 남은 초
        int remainSeconds = totalSeconds % 3600;

        // 1분 = 60초
        int minute = remainSeconds / 60;

        // 분을 구하고 남은 초
        int second = remainSeconds % 60;

        // 결과 출력
        System.out.println(hour + "시간 " + minute + "분 " + second + "초");

        sc.close();
	}

}
